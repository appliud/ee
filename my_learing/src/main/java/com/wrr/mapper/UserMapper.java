package com.wrr.mapper;

import com.wrr.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import com.wrr.util.MyBatisUtil;
@Slf4j
public class UserMapper {

    public void addUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.insert("addUser",user);
            log.info("addUser:{}",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteUser(Integer id){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.delete("deleteUser",id);
            log.info("deleteUser:{}",id);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.update("updateUser",user);
            log.info("updateUser:{}",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public User getUserById(Integer id){
        User user = null;
        try(SqlSession session = MyBatisUtil.getSession()){
            user = session.selectOne("getUserById",id);
            log.info("getUserById:{}",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public List<User> getUserByName(String name){
        List<User> user = null;
        try(SqlSession session = MyBatisUtil.getSession()){
            user = session.selectList("getUserByName", name);
            log.info("getUserByName:{}",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public List<User> getUserAll(){
        List<User> user = null;
        try(SqlSession session = MyBatisUtil.getSession()){
            user = session.selectList("getUserAll");
            log.info("getAllUser:{}",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
