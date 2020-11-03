package com.test;

import com.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author HUI
 * @create 2020-10-22 17:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestStu {
    @Autowired
    private UserDao userDao;

    @Test
    public void del(){
        int num = userDao.deleteByPrimaryKey(17);
        System.out.println(num);
    }


}
