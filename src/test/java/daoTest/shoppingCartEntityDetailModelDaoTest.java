package daoTest;

import com.angzhao.dao.shoppingCartDetailDao;
import com.angzhao.model.shoppingCartDetailModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class shoppingCartEntityDetailModelDaoTest {

    @Autowired
    shoppingCartDetailDao shoppingCartDetailDao;

    @Test
    public void insert() {
        shoppingCartDetailModel shoppingCartDetailModel = new shoppingCartDetailModel();
        shoppingCartDetailModel.setFoodAmount(1);
        shoppingCartDetailModel.setUserId("1234");
        assertEquals(shoppingCartDetailDao.insert(shoppingCartDetailModel), 1);

    }

    @Test
    public void delete() {
        shoppingCartDetailModel shoppingCartDetailModel = new shoppingCartDetailModel();
        shoppingCartDetailModel.setFoodAmount(1);
        shoppingCartDetailModel.setUserId("1234");
        assertEquals(shoppingCartDetailDao.delete(shoppingCartDetailModel), 1);
    }

    @Test
    public void query() {
        assertNotNull(shoppingCartDetailDao.queryByFoodId("123"));
    }

}

