import { createRouter, createWebHashHistory } from "vue-router";
import { defineUser } from "../store/userStore";
import pinia from "../pinia";
let sysUser = defineUser(pinia);

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/",
      component: () => import("../components/Login.vue"),
    },
    {
      path: "/login",
      component: () => import("../components/Login.vue"),
    },
    {
      path: "/showSchedule",
      component: () => import("../components/ShowSchedule.vue"),
    },
    {
      path: "/regist",
      component: () => import("../components/Regist.vue"),
    },
  ],
});

// 路由 的全局前置守卫 判断是否可以访问showSchedule
router.beforeEach((to, from) => {
  if (to.path == "/showSchedule") {
    // 登录过放行
    // 没登录 回登录页
    if (sysUser.username == "") {
      return "/login";
    }
  }
});

export default router;
