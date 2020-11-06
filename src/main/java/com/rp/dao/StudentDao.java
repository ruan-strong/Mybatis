package com.rp.dao;

import com.rp.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @Author rp
 * @Date 2020/11/5 0005 14:52
 * @Version 1.0
 */
public interface StudentDao {
    List<Student> selectStudent(Student student);

    List<Student> selectManyToOne();

}
