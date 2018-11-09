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

    @Autowired
    recommendService recommendService;

    @Autowired
    foodDao foodDao;

    @Test
    public void insertRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity food1 = recommendService.insertRecommendFood(food);
        assertEquals(food1,food);
    }

    @Test
    public void deleteRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity food1 = recommendService.deleteRecommendFood(food);
        assertEquals(food1,food);
    }

    @Test
    public void queryRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        foodEntity foodEntity = recommendService.queryRecommendFood(food);
        if (foodEntity != null) {
            System.out.print(foodEntity.getFoodId()+" ");
            System.out.print(foodEntity.getFoodName()+" ");
            System.out.print(foodEntity.getFoodImg()+" ");
            System.out.print(foodEntity.getFoodPrice()+" ");
            System.out.print(foodEntity.getFoodReserve()+" ");
            System.out.println(foodEntity.getFoodDetails());
            }
        else {
            System.out.println("ID不存在！");
        }
    }
}
