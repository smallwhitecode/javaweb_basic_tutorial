package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/9/11
 * @Description:web-all
 */

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向请求域中放入数据
        req.setAttribute("request", "requestMessage");
        // 向会话域中放入数据
        HttpSession session = req.getSession();
        session.setAttribute("session", "sessionMessage");
        // 向应用域中放入数据
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("application", "applicationMessage");

        // 获取请求数据
        String reqMessage = (String)req.getAttribute("request");
        System.out.println("请求域：" + reqMessage);
    }
}
