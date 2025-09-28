package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/9/8
 * @Description:web-all 1、实例化                构造器
 * 2、初始化                init
 * 3、接受请求，处理请求 服务  service
 * 4、销毁                  destroy
 * <p>
 * Servlet在Tomcat中是单例的
 * Servlet的成员变量在多个线程栈之中是共享的
 * 不建议在service方法中修改成员变量     在并发请求时，会引发线程安全问题
 */

@WebServlet(value = "/servletLifeCycle", loadOnStartup = 100)
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle() {
        System.out.println("构造器");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
