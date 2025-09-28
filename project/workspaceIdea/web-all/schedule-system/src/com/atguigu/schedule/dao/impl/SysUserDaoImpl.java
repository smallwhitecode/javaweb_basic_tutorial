package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.util.JDBCUtil;

import java.util.List;

/**
 * @Author:李强
 * @Date:2025/9/10
 * @Description:web-all
 */

public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql = "insert into sys_user values (null,?,?)";
        return baseUpdate(sql, sysUser.getUsername(), sysUser.getUserPwd());
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql = "select uid,username,user_pwd userPwd from sys_user where username=?";
        List<SysUser> list = baseQuery(SysUser.class, sql, username);
        return list != null && list.size() > 0 ? list.get(0) : null;
    }
}
