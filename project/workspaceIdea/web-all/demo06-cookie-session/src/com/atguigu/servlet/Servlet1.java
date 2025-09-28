package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/9/10
 * @Description:web-all
 */

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求中username参数
        String username = req.getParameter("username");
        // 获得session对象
        HttpSession session = req.getSession();
        //session.setMaxInactiveInterval(120);
        // 判断请求中有没有一个特殊的cookie JSESSIONID 值 *** ***
        // 1 有
        //      根据JSESSIONID找对应session对象
        //      找到了  返回之前的session
        //      没找到  创建一个新的session返回，并且response对象中存放一个JESSIONID 的cookie
        // 2 没有
        //      创建一个新的session返回，并且response对象中存放一个JESSIONID 的cookie
        System.out.println(session.getId());
        System.out.println(session.isNew());

        // 将username存入session
        session.setAttribute("username", username);
        // 客户端响应信息
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("成功");

    }
}
