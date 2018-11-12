package daoTest;

import com.angzhao.dao.shoppingCartDetailDao;
import com.angzhao.entity.shoppingCartDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class shoppingCartDetailDaoTest {

    @Autowired
    shoppingCartDetailDao shoppingCartDetailDao;

    @Test
    public void insert() {
        shoppingCartDetail shoppingCartDetail = new shoppingCartDetail();
        shoppingCartDetail.setFoodAmount(1);
        shoppingCartDetail.setUserId("1234");
        assertEquals(shoppingCartDetailDao.insert(shoppingCartDetail), 1);

    }

    @Test
    public void delete() {
        shoppingCartDetail shoppingCartDetail = new shoppingCartDetail();
        shoppingCartDetail.setFoodAmount(1);
        shoppingCartDetail.setUserId("1234");
        assertEquals(shoppingCartDetailDao.delete(shoppingCartDetail), 1);
    }

    @Test
    public void query() {
        assertNotNull(shoppingCartDetailDao.queryByFoodId("123"));
    }

}

