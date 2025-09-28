import { createWebHashHistory, createRouter } from "vue-router";

import Home from "../components/Home.vue";
import Login from "../components/Login.vue";

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/home",
      component: Home,
    },
    {
      path: "/login",
      component: Login,
    },
  ],
});

// 通过路由的前置守卫校验登录
// VUE3 移除next 但还是可以使用
router.beforeEach((to, from) => {
  if (to.path != "/login") {
    // 判断如果是要去登录视图，直接放行即可
    if (null == window.sessionStorage.getItem("username")) {
      return '/login'
    }
  }
});

/* router.beforeEach((to,from,next)=>{
  if(to.path=='/login'){
    next()
  }else{
    if(null!=window.sessionStorage.getItem("username")){
      next()
    }else{
      next("/login")
    }
  }
}) */

export default router;
