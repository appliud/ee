import com.wrr.mapper.UserMapper;
import com.wrr.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;

@Slf4j
public class UserTest {

    UserMapper userMapper = new UserMapper();

    @Test
    public void insertUser(){
        User user = new User("李明",18,"c1");
        userMapper.addUser(user);
    }

    @Test
    public void selectUserId(){
        Integer id=3;
        User user = userMapper.getUserById(id);
        log.info("selectUserId:{}",user);
    }

    /**
     * 查询所以的用户
     */
    @Test
    public void selectUserAll(){
        List<User> users = userMapper.getUserAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 修改用户
     */
    @Test
    public void updateUser(){
        User user = new User(26, "李明2", 22, "d1");
        userMapper.updateUser(user);
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUser(){
        Integer id=26;
        userMapper.deleteUser(id);
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

