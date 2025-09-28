package com.atguigu.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:李强
 * @Date:2025/9/7
 * @Description:demo-xml
 */

public class TestDom4j {

    @Test
    public void TestDom4j() throws DocumentException {
        // 读取jdbc.xml配置文件，获得document对象
        SAXReader saxReader = new SAXReader();
        //通过类加载器获得只想字节码根路径下的指定文件的输入流
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("jdbc.xml");
        //通过输入流获得配置文件，解析成一个dom对象
        Document document = saxReader.read(resourceAsStream);

        // 从document对象上获取配置文件中的信息
        Element rootElement = document.getRootElement();
        //获取所有子标签
        List<Element> sonElementList = rootElement.elements();
        //获取指定标签名的子标签
        //List<Element> sonElementList = rootElement.elements("标签名");
    }
}
