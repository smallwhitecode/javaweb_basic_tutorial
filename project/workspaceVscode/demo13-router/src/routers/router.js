import { createRouter,createWebHashHistory } from "vue-router";

/* 导入.vue组件 */
import Home from "../components/Home.vue";
import List from "../components/List.vue";
import Update from "../components/Update.vue";
import Add from "../components/Add.vue";
import ShowDetail from "../components/ShowDetail.vue";
import ShowDetail2 from "../components/ShowDetail2.vue";

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/showDetail2",
      component: ShowDetail2,
    },
    {
      path: "/showDetail/:id/:language",
      component: ShowDetail,
    },
    {
      path: "/",
      component: Home,
    },
    {
      path: "/home",
      component: Home,
    },
    {
      path: "/list",
      component: List,
    },
    {
      path: "/add",
      component: Add,
    },
    {
      path: "/update",
      component: Update,
    },
  ],
});

// 设置全局前置守卫
// 每次路由切换页面前，都会执行beforeEach中的回调函数
router.beforeEach((to,from,next)=>{
  /*
  to   下一个页面  到哪里来
  from 上一个页面 从哪里来
  next 放行的方法 只有执行了该方法 才会放行路由
          next() 放行
          next("/路径")   路由的重定向
  */
 console.log("beforeEach");
 console.log(to.path,from.path)
 next()

})

// 设置全局后置守卫
// 每次路由切换页面前，都会执行afterEach中的回调函数
router.afterEach((to,from)=>{
  console.log("afterEach")
})

export default router