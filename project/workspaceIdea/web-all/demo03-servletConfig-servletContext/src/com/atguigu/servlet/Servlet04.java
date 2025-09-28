package com.atguigu.servlet;

import javax.servlet.ServletException;
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

@WebServlet("/servlet04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());        //获取请求方式
        System.out.println(req.getScheme());        //获取请求协议
        System.out.println(req.getProtocol());      //获取请求协议及版本
        System.out.println(req.getRequestURI());    //获取请求uri   项目内的资源路径
        System.out.println(req.getRequestURL());    //获取请求url   项目内资源的完成的路径

        System.out.println(req.getLocalPort());
        System.out.println(req.getServerPort());
        System.out.println(req.getRemotePort());
        //根据名字单独获取某个请求头
        String accept = req.getHeader("Accept");
        System.out.println("accept:" + accept);

        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String hname = headerNames.nextElement();
            System.out.println(hname + ":" + req.getHeader(hname));
        }
    }
}
