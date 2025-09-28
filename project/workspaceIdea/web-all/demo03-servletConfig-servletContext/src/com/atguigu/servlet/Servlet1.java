package com.atguigu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author:李强
 * @Date:2025/9/9
 * @Description:web-all
 */

@WebServlet(
        urlPatterns = "/servlet1",
        initParams = {@WebInitParam(name = "keya",value = "valuea"),@WebInitParam(name = "keyb",value = "valueb")}
)
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------servletConfig获取参数---------------------");
        ServletConfig servletConfig = getServletConfig();
        // 获取初始配置信息即可
        // 根据参数名获取参数值
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keya:" + keya);

        // 获取所有的初始参数的名字
        // hasMoreElements 判断有没有下一个参数，如果有返回true 如果没有返回false
        // nextElement     1取出下一个元素 2向下移动游标
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String pname = initParameterNames.nextElement();
            System.out.println(pname + "=" + getInitParameter(pname));
        }
        System.out.println("---------------servletContext获取参数---------------------");
        // 获取ServletContext
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();
        System.out.println(servletContext == servletContext1);
        System.out.println(servletContext2 == servletContext1);

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding:" + encoding);
        Enumeration<String> initParameterNames1 = servletContext.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()) {
            String pname = initParameterNames1.nextElement();
            System.out.println(pname + "=" + servletContext.getInitParameter(pname));
        }

        //作为域对象，一定会有的API
        //void setAttribute(String key,Object value);向域中存储/修改数据
        servletContext.setAttribute("ka", "va");
        servletContext.setAttribute("ka", "vaa");
        //Object getAttribute(String key);获得域中的数据
        //Object ka = servletContext.getAttribute("ka");
        //String ka = (String) servletContext.getAttribute("ka");
        //void removeAttribute(String key);移除域中的数据
        servletContext.removeAttribute("ka");
    }
}
