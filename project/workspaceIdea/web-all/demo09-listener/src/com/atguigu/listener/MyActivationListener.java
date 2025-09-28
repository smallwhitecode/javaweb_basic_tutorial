package com.atguigu.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @Author:李强
 * @Date:2025/9/11
 * @Description:web-all
 */

public class MyActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        //
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {

    }
}
