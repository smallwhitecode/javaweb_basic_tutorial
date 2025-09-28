<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
const router = useRouter()
let mypath = ref("")

function goMyPage(){
  router.push(mypath.value)
}

</script>

<template>
  <div>
    <!-- 路由的连接 -->
    <router-link to="/home">home页</router-link> <br>
    <router-link to="/list">list页</router-link> <br>
    <router-link to="/add">add页</router-link> <br>
    <router-link to="/update">update页</router-link> <br>
    <!-- 编程式路由 -->
    <button @click="goMyPage()">Go</button><input type="text" v-model="mypath"></input>
    <hr>
    <router-view></router-view>

  </div>
</template>

<style scoped></style>
