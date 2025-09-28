/* 导入 创建路由对象需要使用的函数 */
import {createRouter,createMemoryHistory, createWebHashHistory} from 'vue-router'

/* 导入.vue组件 */
import Home from '../components/Home.vue'
import List from '../components/List.vue'
import Update from '../components/Update.vue'
import Add from '../components/Add.vue'

// 创建一个路由对象
const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/",
      components: {
        default: Home,
        homeView: Home,
      },
    },
    {
      path: "/list",
      components: {
        listView: List,
      },
    },
    {
      path: "/showAll",
      // 重定向
      redirect: "/list",
    },
    {
      path: "/add",
      components: {
        addView: Add,
      },
    },
    {
      path: "/update",
      components: {
        updateView: Update,
      },
    }
  ]
});

export default router