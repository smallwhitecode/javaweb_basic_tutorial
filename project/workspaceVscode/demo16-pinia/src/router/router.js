import { createRouter, createWebHashHistory } from "vue-router";

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/operate",
      components: {
        default: () => import("../components/Operate.vue"),
        list: () => import("../components/List.vue"),
      },
    },
    {
      path: "/list",
      component: () => import("../components/List.vue"),
    },
    {
      path: "/",
      component: () => import("../components/Operate.vue"),
    },
  ],
});

export default router;
