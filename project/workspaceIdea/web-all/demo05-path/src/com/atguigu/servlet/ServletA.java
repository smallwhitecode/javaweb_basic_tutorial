package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/9/9
 * @Description:web-all
 */

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA");
        //  重定向到servletB
        /*
        *
        * 1 相对路径写法
        *       和前端的相对路径规则一样
        * 2 绝对路径写法
        *       http://localhost:8080/
        *  */
        //ServletContext servletContext = req.getServletContext();
        //servletContext.getContextPath();
        //resp.sendRedirect("/demo05/servletB");

        /*  请求转发到ServletB
        * 1 相对路径写法 一致
        *           http://localhost:8080/demo05/servletA
        * 2 绝对路径写法
        *           请求转发的绝对路径是不需要添加项目上下文
        *           请求转发的/      代表的路径是  http://localhost:8080/demo05
        *  */
        req.getRequestDispatcher("/servletB").forward(req, resp);

    }
}
