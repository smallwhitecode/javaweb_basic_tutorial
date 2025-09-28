/* 定义共享的pinia数据 */
import { defineStore } from "pinia";

// 定义一个Person共享
export const definePerson = defineStore("person", {
  state: () => {
    return {
      username: "zhangsan",
      age: 0,
      hobbies: ["唱歌", "跳舞"],
    };
  },
  getters: {
    // 用于定义一些通过数据计算而得到结果的一些方法 一般在此处不做对数据的修改操作
    // getters中的方法可以当做属性值方式使用
    getHobbiesCount() {
      return this.hobbies.length;
    },
    getAge: (state) => {
      return state.age;
    },
  },
  actions: {
    // 用于定义一些对数据修改的方法
    doubleAge() {
      this.age = this.age * 2;
    },
  },
});
