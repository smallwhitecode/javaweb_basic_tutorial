<script setup>
// 接收父组件的参数
import { defineProps } from 'vue';

// const props = defineProps(["message"])
defineProps({
  message:String
})
</script>

<template>
  <div>
    <!-- {{ props.message }} -->
      {{ message }}
  </div>
</template>

<style scoped>

</style>
