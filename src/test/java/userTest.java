import com.alibaba.fastjson.JSON;
import com.itcast.dao.UserDao;
import com.itcast.pojo.User;
import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceimpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by ljfeng on 2017/7/24.
 */

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis-Context.xml"})
public class userTest {
    //private static Logger logger = Logger.getLogger(userTest.class);
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @Test
    public void test1() {
        User user = userService.getUserById(2);
        //logger.info(JSON.toJSONString(user));
        System.out.println("-----------------------------" + user.toString());

        int x = userService.deleteUserById(1);
        System.out.println("--------------------"+x);

        User user1 = new User(1,"bgh","bghc",2);

        int y = userService.insert(user1);
        System.out.println("--------------------"+ y );

        user1.setAge(12);
        int z = userService.updateUser(user1);
        System.out.println("--------------------"+ z );
    }

    @Test
    public void test2(){
        System.out.println(userDao);
        System.out.println(userService);
    }
}
