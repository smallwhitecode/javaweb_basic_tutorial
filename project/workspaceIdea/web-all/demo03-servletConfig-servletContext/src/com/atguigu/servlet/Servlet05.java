package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @Author:李强
 * @Date:2025/9/9
 * @Description:web-all
 */

@WebServlet("/servlet05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求中的参数
        String username = req.getParameter("username");
        System.out.println(username);
        String userPwd = req.getParameter("userPwd");
        System.out.println(userPwd);
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //获取所有的参数名
        Enumeration<String> pnames = req.getParameterNames();
        while (pnames.hasMoreElements()) {
            String pname = pnames.nextElement();
            String[] values = req.getParameterValues(pname);
            if (values.length > 1) {
                System.out.println(pname + "=" + Arrays.toString(values));
            } else {
                System.out.println(pname + "=" + values[0]);
            }
        }
        //返回所有参数的map集合，  key=参数名    value = 参数值
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entrySet = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entrySet) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            if (value.length > 1) {
                System.out.println(key + "=" + Arrays.toString(value));
            } else {
                System.out.println(key + "=" + value[0]);
            }
        }

        // 如果要获取请求体中的非键值对数据？    JSON串   文件
        // 获取一个从请求体中读取字符的字符输入流
        //BufferedReader reader = req.getReader();
        // 获得一个从请求中读取二进制数据字节的输入流
        //ServletInputStream inputStream = req.getInputStream();

        System.out.println(req.getServletPath());
    }
}
