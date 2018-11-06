package serviceTest;

import com.angzhao.entity.orderFormDetailEntity;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.entity.userEntity;
import com.angzhao.service.orderFormService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class orderFormServiceTest {

    @Autowired
    orderFormService orderFormService;

    @Test
    public void queryOrderFormListByUserIdTest() {
        List<orderFormEntity> list = orderFormService.getOrderFormByUserId("1234");
        for (orderFormEntity orderFormEntity : list) {
            System.out.println(orderFormEntity.toString());
            for (orderFormDetailEntity orderFormDetailEntity : orderFormEntity.getOrderFormDetailList()) {
                System.out.println(orderFormDetailEntity.toString());
            }
        }

    }

    @Test
    public void queryOrderFormListByUserId1Test() {
        List<orderFormEntity> list = orderFormService.getOrderFormByUserId("1234");
        for (orderFormEntity orderFormEntity : list) {
            System.out.println(orderFormEntity.getOrderFormId());
        }

    }
}
