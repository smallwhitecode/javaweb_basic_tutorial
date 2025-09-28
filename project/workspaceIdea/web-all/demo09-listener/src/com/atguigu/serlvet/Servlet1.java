package com.atguigu.serlvet;

import com.atguigu.listener.MyActivationListener;
import com.atguigu.listener.SessionBingingListener;

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

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向应用域中放入数据

        ServletContext application = this.getServletContext();
        application.setAttribute("keya", "valuea");

        //HttpSession session = req.getSession();
        //
        //// 手动销毁
        //session.invalidate();

        HttpSession session = req.getSession();
        // 绑定监听器
        session.setAttribute("bindingListener",new SessionBingingListener());
        // 解除绑定监听器
        session.removeAttribute("bindingListener");

        MyActivationListener myActivationListener = new MyActivationListener();
        session.setAttribute("k1","v1");
    }
}
