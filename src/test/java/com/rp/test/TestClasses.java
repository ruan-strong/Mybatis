package com.rp.test;

import com.rp.dao.ClassesDao;
import com.rp.pojo.Classes;
import com.rp.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author rp
 * @Date 2020/11/6 0006 11:53
 * @Version 1.0
 */
public class TestClasses {
    @Test
    public void testClassByName(){
        SqlSession session = MybatisUtil.getSession();
        ClassesDao classesDao = session.getMapper(ClassesDao.class);

        Classes classes =classesDao.selectOneToMany("一班");

        MybatisUtil.closeSession(session);
    }
}
