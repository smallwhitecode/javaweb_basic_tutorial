package com.atguigu.servlet;

import javax.servlet.RequestDispatcher;
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
        System.out.println("servletA 执行了");

        String money = req.getParameter("money");
        System.out.println("servletA获得参数：money:" + money);

        //  请求转发给ServletB
        //  获得请求转发器
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletB");
        //  转发给一个视图资源 ok
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("a.html");
        //  转发给WEB-INF下的资源  ok
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/b.html");
        //  转发给外部资源   no
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("http://www.atguigu.com");
        //  让请求转发器做出转发动作
        requestDispatcher.forward(req, resp);
    }
}
