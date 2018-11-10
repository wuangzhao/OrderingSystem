package daoTest;


import com.angzhao.dao.foodDao;
import com.angzhao.dao.salesDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.salesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class salesDaoTest {

    /**
     *
     */

    @Autowired
    salesDao salesDao;

    @Autowired
    salesService salesService;

    @Autowired
    foodDao foodDao;

    @Test
    public void insertSalesTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a002");
        foodEntity food1 = salesService.insertSalesFood(food);
     //   assertEquals(food1,food);
    }

    @Test
    public void deleteSalesTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity food1 = salesService.deleteSalesFood(food);
        assertEquals(food1,food);
    }

    @Test
    public void querySalesTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity foodEntity = salesService.querySalesFood(food);
        if (foodEntity != null) {
            System.out.println(foodEntity);
            }
        else {
            System.out.println("ID不存在！");
        }
    }
}
