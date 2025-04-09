package com.wrr;

import com.wrr.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import com.wrr.mapper.UserMapper;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@Slf4j
public class UserTest {

    UserMapper userMapper = new UserMapper();

    @Test
    public void insertUser(){
        int id =userMapper.getMaxId();
        User user = new User(id+1,"谢君豪",18,"c2");
        userMapper.addUser(user);
        // 验证插入是否成功
        assertNotNull(userMapper.getUserById(user.getId()));
    }

    @Test
    public void selectUserId(){
        Integer id=3;
        User user = userMapper.getUserById(id);
        assertNotNull(user);
    }

    /**
     * 修改用户
     */
    @Test
    public void updateUser(){
        User user = new User(10, "李明2", 22, "d1");
        userMapper.updateUser(user);
        assertEquals(userMapper.getUserById(user.getId()), user);
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUser(){
        Integer id=11;
        userMapper.deleteUser(id);
        assertNull(userMapper.getUserById(id));
    }
    /**
     * 查询所有的用户
     */
    @Test
    public void selectUserAll(){
        List<User> users = userMapper.getUserAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test(){
        String name="张三";
        List<User> users = userMapper.getUserByName(name);
        for (User user : users) {
            System.out.println(user);
        }
    }
}

