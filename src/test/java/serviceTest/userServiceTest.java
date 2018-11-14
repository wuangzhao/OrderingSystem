package serviceTest;

import com.angzhao.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class userServiceTest {

    @Autowired
    userService userService;

    @Test
    public void name() {
        System.out.println(userService.getUserByUserName("test").getUserPassword());
    }
}
