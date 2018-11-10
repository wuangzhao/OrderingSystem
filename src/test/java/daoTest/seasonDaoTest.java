package daoTest;


import com.angzhao.dao.foodDao;
import com.angzhao.dao.seasonDao;
import com.angzhao.entity.foodEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class seasonDaoTest {

    /**
     *
     */

    @Autowired
    seasonDao seasonDao;

    @Autowired
    com.angzhao.service.seasonService seasonService;

    @Autowired
    foodDao foodDao;

    @Test
    public void insertSeasonTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity food1 = seasonService.insertSeasonFood(food);
        assertEquals(food1,food);
    }

    @Test
    public void deleteSalesTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity food1 = seasonService.deleteSeasonFood(food);
        assertEquals(food1,food);
    }

    @Test
    public void querySalesTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity foodEntity = seasonService.querySeasonFood(food);
        if (foodEntity != null) {
            System.out.println(foodEntity);
            }
        else {
            System.out.println("ID不存在！");
        }
    }
}
