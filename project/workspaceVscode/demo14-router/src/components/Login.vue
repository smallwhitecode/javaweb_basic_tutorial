<script setup>
import { ref } from 'vue'
import {useRouter } from 'vue-router'
let router = useRouter()

let username = ref('')
let password = ref('')

function login() {
  // 获取用户名和密码 校验 用户名如果是root并且密码是123456 则登录成功
  // 登录成功则自动跳转到 /home
  // 登录失败,不跳转页面 提示
  if (username.value == "root" && password.value == "123456") {
    // 路由的跳转 /home
    // 将用户名保存在浏览器上     sessionStorage localStorage
    window.sessionStorage.setItem("username",username.value)
    router.push({path:"/home"})
  } else {
    alert("用户名或者密码有误")
  }
}

</script>

<template>
  <div>
    账号： <input type="text" v-model="username" placeholder="请输入账号！"><br>
    密码： <input type="password" v-model="password" placeholder="请输入密码！"><br>
    <button @click="login()">登录</button>
  </div>

</template>

<style scoped></style>
