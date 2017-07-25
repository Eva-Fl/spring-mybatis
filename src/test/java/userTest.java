import com.alibaba.fastjson.JSON;
import com.itcast.pojo.User;
import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceimpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
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
    @Resource
    private UserService userService;

    @Test
    public void test1() {
        User user = userService.getUserById(1);
        //logger.info(JSON.toJSONString(user));
        System.out.println("--------------------------------" + user.toString());
    }
}
