package com.baizhi;

import com.baizhi.dao.EmpMapper;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.Emp;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = "com.baizhi.dao")
public class SpringbootDay01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmpMapper empMapper;
    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }
    @Test
    public void TestEmp() {
        Emp emp = empMapper.selectByPrimaryKey(2);
        System.out.println("emp = " + emp);
    }

}
