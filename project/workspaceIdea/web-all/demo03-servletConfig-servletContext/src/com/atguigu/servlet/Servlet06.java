package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:李强
 * @Date:2025/9/9
 * @Description:web-all
 */

@WebServlet("/servlet06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  设置响应行相关的API HTTP/1.1    200/400/500/...
        resp.setStatus(200);
        //  设置响应头相关的API
        //resp.setHeader("aaa", "valuea");
        //resp.setHeader("Content-Type", "text/html");
        //resp.setHeader("Content-Length", "1234");
        String info = "<h1>hello</h1>";
        resp.setContentType("text/html");
        resp.setContentLength(info.length());
        //  设置响应体内容的API
        //  获得一个向响应体中输入文本字符输出流
        PrintWriter writer = resp.getWriter();
        writer.write(info);

        //  获得一个向响应体重输入二进制信息的字节输出流
        //ServletOutputStream outputStream = resp.getOutputStream();

    }
}
