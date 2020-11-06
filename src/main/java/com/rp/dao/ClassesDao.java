package com.rp.dao;

import com.rp.pojo.Classes;

/**
 * @Author rp
 * @Date 2020/11/6 0006 11:42
 * @Version 1.0
 */
public interface ClassesDao {
    Classes selectOneToMany(String name);
}
