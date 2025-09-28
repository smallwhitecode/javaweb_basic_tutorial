package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

/**
 * @Author:李强
 * @Date:2025/9/10
 * @Description:web-all
 */

public interface SysUserDao {

    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加的记录的username和user_pwd字段以SysUser实体类对象的形式接收
     * @return
     */
    int addSysUser(SysUser sysUser);

    /**
     * 根据用户名获得完整用户信息的方法
     * @param username 要查询的用户名
     * @return  如果找到了返回SysUser对象，找不到返回null
     */
    SysUser findByUsername(String username);
}
