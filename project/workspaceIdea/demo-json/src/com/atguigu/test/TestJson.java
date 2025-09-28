package com.atguigu.test;

import com.atguigu.pojo.Dog;
import com.atguigu.pojo.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:李强
 * @Date:2025/9/6
 * @Description:demo-json
 */

public class TestJson {

    @Test
    public void testWriteJson() throws JsonProcessingException {
        //实例化 Person对象，将Person对象转换为Json串
        Dog dog = new Dog("小黄");
        Person person = new Person("张三", 10, dog);
        //将Person对象转换成一个字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);
        System.out.println(personStr);
    }

    @Test
    public void testReadJson() throws JsonProcessingException {
        String personStr = "{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(personStr, Person.class);
        System.out.println(person);
    }

    //map
    @Test
    public void testMapJson() throws JsonProcessingException {
        Map data = new HashMap();
        data.put("a", "valuea");
        data.put("b", "valueb");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);
    }

    //list array
    @Test
    public void testListJson() throws JsonProcessingException {
        //List data = new ArrayList();
        //data.add("a");
        //data.add("b");
        //data.add("c");

        String[] data = {"a", "b", "c"};

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);
    }
}
