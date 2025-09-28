<script setup>
import { ref,reactive,watch, watchEffect } from 'vue';

let fullname = ref('')
let firstname = ref('李')
let lastname = reactive({
   name: '华'
})

// 任何的响应式数据，如果想监听，直接监听即可，无需将要监听的响应式数据作为参数
watchEffect(()=>{
  fullname.value=firstname.value+lastname.name
})

// watch函数监听一个ref的响应式数据
/* watch(firstname, (newValue,oldValue)=>{
  console.log(`${oldValue}变为${newValue}`);
  fullname.value = newValue +lastname.name;
}) */
// watch函数监听一个人active响应式数据 专门监听reactive响应式数据中的一个属性
/* watch(()=>lastname.name,(name,oldValue)=>{
  console.log(`${oldValue}变为${name}`);
  fullname.value = name + firstname.value;
}) */
// watch函数监听一个人active响应式数据 专门监听reactive响应式数据中的一个属性
/* watch(() => lastname, (newValue, oldValue) => {
  console.log(`${oldValue}变为${newValue}`);
  fullname.value = firstname.value+newValue.name
},{deep:true,immediate:true}) */

</script>

<template>
  <div>
    姓氏:<input type="text" v-model="firstname"> <br>
    名字:<input type="text" v-model="lastname.name"> <br>
    全名:{{ fullname }} <br>
  </div>
</template>

<style scoped>

</style>
