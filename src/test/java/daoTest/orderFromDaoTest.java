package daoTest;

import com.angzhao.dao.orderFormDao;
import com.angzhao.model.orderFormDetailModel;
import com.angzhao.entity.orderFormEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class orderFromDaoTest {

    @Autowired
    orderFormDao orderFromDao;

    @Test
    public void insert() {
        orderFormEntity orderFormEntity = new orderFormEntity();
        orderFormEntity.setUserId("1234");
        orderFormEntity.setStatus("1");
        orderFromDao.insertByOrderForm(orderFormEntity);
        System.out.println(orderFormEntity.getOrderFormId());

    }

    @Test
    public void queryOrderFormListByUserIdTest() {
        List<orderFormEntity> list = orderFromDao.queryOrderFormListByUserId("1234");
        for (orderFormEntity orderFormEntity : list) {
            System.out.println(orderFormEntity.getStatus());
        }
    }

    @Test
    public void queryOrderFormDetailByOrderFromId() {
        orderFormEntity orderFormEntity = new orderFormEntity();
        orderFormEntity.setOrderFormId("10000");
        List<orderFormDetailModel> list = orderFromDao.queryOrderFormDetailByOrderFrom(orderFormEntity);
        for (orderFormDetailModel orderFormDetailModel : list) {
            System.out.println(orderFormDetailModel.toString());

        }
        assertEquals(list.size(), 2);
    }

    @Test
    public void updateOrderFormStatus() {
        orderFormEntity orderFormEntity = new orderFormEntity();
        orderFormEntity.setOrderFormId("10001");
        orderFormEntity.setStatus("2");
        assertEquals(orderFromDao.updateOrderFormStatus(orderFormEntity), 1);
    }
}
