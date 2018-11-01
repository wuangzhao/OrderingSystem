package daoTest;

import com.angzhao.dao.foodDao;
import com.angzhao.entity.foodEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class foodDaoTest {

    @Autowired
    foodDao foodDao;

    @Test
    public void insertTest(){
        foodEntity food = new foodEntity();
        food.setFoodId(UUID.randomUUID().toString());
        food.setFoodReserve(100);
        food.setFoodPrice(12);
        food.setFoodName("测试1");
        food.setFoodImg("3.png");
        food.setFoodDetails("详情1");
        int i = foodDao.insert(food);
        assertEquals(i, 1);
    }

    @Test
    public void deleteTest(){
        int i = foodDao.delete("978940f0-b47d-4f8a-a153-4226c2aa8565");
        assertEquals(i, 1);
    }



}
