package com.atguigu.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:李强
 * @Date:2025/9/11
 * @Description:web-all
 * 日志过滤器  记录请求的历史 将日志打印到控制台
 */

@WebFilter(
        filterName = "loggingFilter",
        initParams = {@WebInitParam(name = "dateTimePattern", value = "yyyy-MM-DD HH:mm:ss")},
        urlPatterns = {"/servlet1", "*.html"},
        servletNames = {"servlet1Name"}
)
public class LoggingFilter implements Filter {

    private SimpleDateFormat dateFormat;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 参数父转子
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 拼接日志文本
        String requestURI = request.getRequestURI();
        String time = dateFormat.format(new Date());
        String beforeLogging = requestURI + "在" + time + "被请求了";
        // 打印日志
        System.out.println(beforeLogging);
        // 获取系统时间
        long t1 = System.currentTimeMillis();
        // 放行请求
        filterChain.doFilter(request, response);
        // 获取系统时间
        long t2 = System.currentTimeMillis();
        String afterLogging = requestURI + "在" + time + "的请求耗时:" + (t2 - t1) + "毫秒";
        // 打印日志
        System.out.println(afterLogging);
    }
}
