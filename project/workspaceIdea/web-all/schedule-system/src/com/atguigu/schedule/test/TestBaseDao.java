package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.util.MD5Util;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author:李强
 * @Date:2025/9/10
 * @Description:web-all
 */

public class TestBaseDao {

    private static BaseDao baseDao;

    @BeforeAll
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }

    @Test
    public void testBaseQueryObject() {
        // 查询用户数量
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery() {
        String sql = "select uid,username,user_pwd as userPwd from sys_user";
        List<Object> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }

    @Test
    public void testBaseUpdate() {
        String sql = "insert into sys_user values (null,?,?)";
        int rows = baseDao.baseUpdate(sql, "zhangsan","123456");
        System.out.println(rows);
    }

    @Test
    public void testMd5() {
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
