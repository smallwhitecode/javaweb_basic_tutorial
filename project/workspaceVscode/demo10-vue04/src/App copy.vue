<script setup>
  /*
  属性渲染命令
  v-bind  将数据绑定到元素的属性上
  v-bind:属性名="数据名"
  :属性名="数据名"
  */
  const data={
    logo: "http://www.atguigu.com/images/index_new/logo.png",
    name:"尚硅谷",
    url:"http://www.atguigu.com"
  }
</script>

<template>
  <div>
    <a :href="data.url">
      <img :src="data.logo" :title="data.name"></img>
    </a>

  </div>
</template>

<style scoped>

</style>
