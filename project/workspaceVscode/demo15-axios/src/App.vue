<script setup>
import axios from 'axios'
import { reactive } from 'vue'

let jsonData = reactive(
  {
    code: 1,
    content: '我努力不是为了你而是因为你'
  }
)

function getLoveMessage() {
  // 使用axios发送请求获取土味情话
  let promise = axios({
    method: "get",
    url: "http://forum.atguigu.cn/api/rand.qinghua?format=json",
    data: {
      username:"张三"
    }
  })

  promise.then(
    function (response) {
      console.log(response)
      Object.assign(jsonData, response.data)
    }
  ).catch(
    function (error) {
      console.log(error)
    }
  )

}
</script>

<template>
  <div>
    <h1 v-text="jsonData.content"></h1>
    <button @click="getLoveMessage()">变</button>
  </div>

</template>

<style scoped></style>
