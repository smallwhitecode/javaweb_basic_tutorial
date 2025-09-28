package com.atguigu.schedule.filter;

import com.atguigu.schedule.pojo.SysUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/9/11
 * @Description:web-all
 */

//@WebFilter(urlPatterns = {"/showSchedule.html", "/schedule/*"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获得session对象
        // 从 session域中获得登录的用户对象
        HttpSession session = request.getSession();
        SysUser sysUser = (SysUser) session.getAttribute("sysUser");
        // 判断用户对象是否存在
        if (null == sysUser) {
            // 没登录 到login.html
            response.sendRedirect("/login.html");
        } else {
            // 登录过 放行
            chain.doFilter(request, response);
        }
    }
}
