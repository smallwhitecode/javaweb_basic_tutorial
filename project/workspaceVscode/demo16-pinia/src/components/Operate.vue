<script setup>
import { definePerson } from '../store/store'
let person = definePerson()
</script>

<template>
  <div>
    <h1>用于修改pinia数据</h1>
    名字:<input type="text" v-model="person.username"><br>
    年龄:<input type="text" v-model="person.age"><br>
    请增加爱好:
    <input type="checkbox" value="吃饭" v-model="person.hobbies"> 吃饭
    <input type="checkbox" value="睡觉" v-model="person.hobbies"> 睡觉
    <input type="checkbox" value="打豆豆" v-model="person.hobbies"> 打豆豆 <br>
    <!-- 事件中调用person的doubleAge()方法 -->
    <button @click="person.doubleAge()">年龄加倍</button> <br>
    <!-- 事件中调用pinia提供的$reset()方法恢复数据的默认值 -->
    <button @click="person.$reset()">恢复默认值</button> <br>
    <!-- 事件中调用$patch方法一次性修改多个属性值 -->
    <button @click="person.$patch({ username: '奥特曼', age: 100, hobbies: ['晒太阳', '打怪兽'] })">变身奥特曼</button> <br>
    <hr>
    展示一下person中的数据{{ person }}
  </div>
</template>

<style scoped>

</style>
