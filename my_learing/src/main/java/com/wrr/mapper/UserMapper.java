package com.wrr.mapper;

import com.wrr.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import com.wrr.util.MyBatisUtil;
public class UserMapper {

    public void addUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.insert("addUser",user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteUser(Integer id){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.delete("deleteUser",id);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.update("updateUser",user);
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
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
