package com.rp.test;

import com.rp.dao.StudentDao;
import com.rp.pojo.Student;
import com.rp.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author rp
 * @Date 2020/11/5 0005 14:52
 * @Version 1.0
 */
public class TestStudent {

    /**
    * @Description: 动态sql
    * @Param:
    * @return:
    * @Author: rp
    * @Date: 2020/11/5 0005
    */
    @Test
    public void testStudent(){
        SqlSession session = MybatisUtil.getSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
/*        Map<String,Object> map = new HashMap<String, Object>();
        map.put("age",30);
        map.put("sex","男");*/
        Student student = new Student();
        student.setAge(30);
        student.setSex("男");
        List<Student> studentList = studentDao.selectStudent(student);
        System.out.println(studentList);
        MybatisUtil.closeSession(session);
    }

    
    /** 
    * @Description: 验证一级缓存
    * @Param:  
    * @return:  
    * @Author: rp
    * @Date: 2020/11/6 0006 
    */ 
    public void testFirstCache(){
        SqlSession session = MybatisUtil.getSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1);
        List<Student> studentList = studentDao.selectStudent(student);

        List<Student> studentList01 = studentDao.selectStudent(student);
        MybatisUtil.closeSession(session);
    }


    /**
    * @Description: 多表联查，多对一
    * @Param:
    * @return:
    * @Author: rp
    * @Date: 2020/11/6 0006
    */
    @Test
    public void testManyToOne(){
        SqlSession session = MybatisUtil.getSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);

        List<Student> studentList =studentDao.selectManyToOne();

        MybatisUtil.closeSession(session);
    }
}
