<script setup>
import {useRouter} from 'vue-router'
let username = window.sessionStorage.getItem("username")
let router = useRouter()

function logout(){
  // 1清除sessionStorage中的用户登录信息
  // 2跳转到login试图
  window.sessionStorage.removeItem("username")
  router.push("/login")
}
</script>

<template>
  <div>
    <h1>home页面</h1>
    <h3>欢迎{{ username }} 登录</h3>
    <button @click="logout()">退出登录</button>
  </div>

</template>

<style scoped></style>
