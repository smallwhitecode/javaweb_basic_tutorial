package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:李强
 * @Date:2025/9/8
 * @Description:web-all
 *
 * servlet开发流程
 * 1、创建javaWeb项目，同时将tomcat添加为当前项目的依赖
 * 2、重写service方法 service(HttpServletRequest req, HttpServletResponse resp)
 * 3、在service方法中，定义业务处理代码
 * 4、在web.xml中，配置servlet 对应的请求映射路径
 *
 *
 * 1、servlet-api.jar 导入问题
 *      servlet-api 编码的时候需要，运行的时候，在服务器的环境中，由服务软件(Tomcat)提供
 *      因此，我们的JAVAWEB项目中，在打包/构建的时候，是无需携带servlet-api的jar包
 * 2、Content-Type响应头的问题
 *      MIME类型响应头       媒体类型，文件类型，响应的数据类型
 *      MIME类型用于告诉客户端响应的数据的类型的数据，客户端以此类型决定用什么方式解析响应体
 */


public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1、从request 对象中获取请求中的任何信息(username参数)
        String username = request.getParameter("username");//根据参数名获取参数值  无论参数是在url？后 还是在请求体中
        // 2、处理业务代码
        String info = "<h1>YES</h1>";
        if ("atguigu".equals(username)) {
            info = "<h1>NO</h1>";
        }
        // 3、将要响应的数据放入response
        // 应该设置Content-Type响应头
        //response.setContentType("text/html");
        response.setHeader("Content-Type","text/html");

        PrintWriter writer = response.getWriter(); // 该方法返回的是一个向响应体中打印字符串的 打印流
        writer.write(info);
    }
}
