package daoTest;


import com.angzhao.dao.foodDao;
import com.angzhao.dao.recommendDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.recommendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class recommendDaoTest {

    /**
     *
     */

    @Autowired
    recommendDao recommendDao;


    @Test
    public void insert() {
        foodEntity foodEntity = new foodEntity();
        foodEntity.setFoodId("123456");
        int i = recommendDao.insertRecommendId(foodEntity);
        assertEquals(i, 1);
    }
}
