package com.wrr.mapper;

import com.wrr.pojo.User;
import com.wrr.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 36153
 */
@Slf4j
public class UserMapper {

    public void addUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.insert("addUser",user);
            log.debug("添加成功");
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteUser(Integer id){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.delete("deleteUser",id);
            log.debug("删除成功");
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        try(SqlSession session = MyBatisUtil.getSession()){
            session.update("updateUser",user);
            log.debug("更新成功");
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
            log.debug("查询成功 {}", user);
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
            log.debug("查询成功");
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
            log.debug("查询成功");
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public Integer getMaxId(){
        Integer id = null;
        try(SqlSession session = MyBatisUtil.getSession()){
            id = session.selectOne("getMaxId");
            log.debug("查询成功 id{}",id);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return id;
    }
}
