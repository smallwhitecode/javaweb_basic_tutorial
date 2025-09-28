<script setup>
import { ref } from 'vue';
/* 需要引入多个Vue组件 */
import Header from './components/Header.vue';
import Navigator from './components/Navigator.vue';
import Content from './components/Content.vue';

let menu = ref("")

function receiver(data){
  menu.value=data
}
</script>

<template>
<div>
  <Header class="header"></Header>
  <Navigator @sendMenu="receiver" class="navigator"></Navigator>
  <Content class="content" :message="menu"></Content>
</div>
</template>

<style scoped>
  .header{
    height:80px;
    border: 1px solid red;
  }
  .navigator{
    width: 15%;
    height: 800px;
    border: 1px solid blue;
    float: left;
  }
  .content{
    width: 83%;
    height: 800px;
    border: 1px solid orange;
    float: right;
  }
</style>
