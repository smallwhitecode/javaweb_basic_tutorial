<script setup>
  /*
  v-text  v-text 不识别html结构的文本

  v-html
  {{ }} 插值表达式
  v-*** vue的指令
   1 命令必须依赖标签，在开始标签中使用
  */
  let msg = "hello vue3";
  /* 命令支持模板字符串 */
  let haha = "haha";
  let msg2 = `hello ${haha}`;
  /* 命令支持常见的运算符 */
  let age = 19;
  /* 命令支持常见对象的API的调用 */
  let bee = "蜜 蜂";
  /* 命令中支持函数的调用 */
  let getMsg = ()=>{
    return "hello"
  }
let fontMsg = "<font color='red'>你好</font>";

</script>

<template>
  <div>
    <h1 v-text="msg"></h1>
    <h1 v-text="msg2"></h1>
    <h1 v-text="`你好 ${haha}`"></h1>
    <h1 v-text='age > 18 ? "成年" : "未成年"'></h1>
    <h1 v-text="bee.split().reverse().join('-')"></h1>
    <h1 v-text="getMsg()"></h1>
    <h1 v-html="fontMsg"></h1>


  </div>
</template>

<style scoped>

</style>
