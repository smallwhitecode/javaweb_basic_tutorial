/*
    *代表module.js中的所有成员
    m1代表所有成员所属的对象
*/
import * as m1 from "./module.js";
// 使用暴露的属性
console.log(m1.PI);
// 调用暴露的方法
let result = m1.sum(10, 20);
console.log(result);
// 使用暴露的Person类
let person = new m1.Person("张三", 10);
person.sayHello();
