<script setup>
/* 接收传递过来的路径参数 */
import { useRoute } from 'vue-router';
import { ref,onUpdated } from 'vue';

let languageId = ref(0)
let languageName = ref("")

const route = useRoute()
languageId.value=route.params.id
languageName.value=route.params.language

onUpdated(() => {
  // 获取对象中的参数(通过query获取参数,此时参数是key-value形式的)
  console.log(route.query)
  console.log(languageId.value)
  console.log(languageName.value)
  languageId.value = route.query.id
  languageName.value = route.query.language

})

</script>

<template>
  <div>
    <h1>ShowDetail2页面</h1>
    <h3>编号{{ route.query.id }}:{{ route .query.language }}是世界上最好的语言</h3>
    <h3>编号{{ languageId }}:{{ languageName }}是世界上最好的语言</h3>
  </div>
</template>

<style scoped>

</style>
