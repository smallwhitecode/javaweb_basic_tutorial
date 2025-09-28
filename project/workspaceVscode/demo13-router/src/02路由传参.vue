<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
const router = useRouter()

function showDetail(id,language){
  // router.push(`/showDetail/${id}/${language}`)
  router.push({ path: `/showDetail/${id}/${language}` })
}

let showDetail2 = (id, language) => {
  /*uri键值对参数,需要使用query */
  router.push({ path: "/showDetail2", query: { id: id, language: language } })
}
</script>

<template>
  <div>
    <router-link to="/showDetail/1/java">声明式路由路径传参</router-link>
    <button @click="showDetail(2,'PHP')">编程式路由路径传参</button>
    <hr>
    <!-- 键值对参数 -->
    <router-link v-bind:to="{ path: '/showDetail2', query: { id: 1, language: 'Java' } }">showDetail2键值对传参显示JAVA</router-link>
    <button @click="showDetail2(1, 'JAVA')">showDetail2动态路由键值对传参显示JAVA</button>
    <router-view></router-view>

  </div>
</template>

<style scoped></style>
