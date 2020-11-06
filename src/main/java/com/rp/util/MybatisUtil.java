package com.rp.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis工具类
 * @Author rp
 * @Date 2020/11/4 0004 16:06
 * @Version 1.0
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resources = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resources);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    /** 
    * @Description: 获取SqlSession
    * @Param:  
    * @return:  
    * @Author: rp
    * @Date: 2020/11/4 0004 
    */ 
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }



    /**
    * @Description:  关闭SqlSession
    * @Param:
    * @return:
    * @Author: rp
    * @Date: 2020/11/4 0004
    */
    public static void closeSession(SqlSession session){
        if(session != null){
            session.close();
        }
    }

}
