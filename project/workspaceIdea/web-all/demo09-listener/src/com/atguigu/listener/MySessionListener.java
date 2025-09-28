package com.atguigu.listener;

import javax.servlet.http.*;

/**
 * @Author:李强
 * @Date:2025/9/11
 * @Description:web-all
 */

public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // 任何一个session域对象的创建都会触发该方法的执行
        HttpSession session = se.getSession();
        System.out.println(session.hashCode()+"会话域初始化了");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 任何一个session域对象的销毁都会触发该方法的执行
        HttpSession session = se.getSession();
        System.out.println(session.hashCode()+"会话域销毁化了");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        // 任何一个session域中增加了数据都会触发方法的执行
        HttpSession session = se.getSession();
        String name = se.getName();
        Object value = se.getValue();

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        // 任何一个session域中移除了数据都会触发方法的执行
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        // 任何一个session域中修改了数据都会触发方法的执行
    }
}
