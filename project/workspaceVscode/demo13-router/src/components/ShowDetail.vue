<script setup>
/* 接收传递过来的路径参数 */
import { useRoute } from 'vue-router';
import { ref,onUpdated } from 'vue';

let languageId = ref(0)
let languageName = ref("")

const route = useRoute()

onUpdated(()=>{
  languageId.value = route.params.id
  languageName.value = route.params.language
})
</script>

<template>
  <div>
    <h1>ShowDetail接收路径参数</h1>
    <h3>{{ languageId }}{{languageName}}是世界上最好的语言</h3>
  </div>
</template>

<style scoped>

</style>
