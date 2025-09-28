<script setup>
// 向父组件发送参数
import { defineEmits } from 'vue';

// 显式触发
const emit = defineEmits(["sendMenu"]);

// 提交数据的方法
function send(data){
  emit("sendMenu",data);
}

</script>

<template>
  <div>
    <ul>
      <!-- 隐式触发 不能在<script steup 部分中使用 -->
      <!-- <li @click="$emit('sendMenu','学员管理')">学员管理</li> -->
      <li @click="send('学员管理')">学员管理</li>
      <li @click="send('图书管理')">图书管理</li>
      <li @click="send('请假管理')">请假管理</li>
      <li @click="send('考试管理')">考试管理</li>
      <li @click="send('讲师管理')">讲师管理</li>
    </ul>
  </div>
</template>

<style scoped>

</style>
