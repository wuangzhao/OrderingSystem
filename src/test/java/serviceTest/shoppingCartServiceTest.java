package serviceTest;

import com.angzhao.service.shoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class shoppingCartServiceTest {

    @Autowired
    shoppingCartService shoppingCartService;

    @Test
    public void test() {
        shoppingCartService.payment("1234");
    }
}
