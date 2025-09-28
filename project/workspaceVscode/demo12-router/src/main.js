import { createApp } from 'vue'
import App from './App.vue'

// 在整个App.vue中可以使用路由
import router from './routers/router.js'

createApp(App).use(router).mount('#app')
