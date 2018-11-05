package daoTest;

import com.angzhao.dao.foodDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.Impl.foodServiceImpl;
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

    @Autowired
    foodServiceImpl foodService;

    @Test
    public void insertTest() {
        foodEntity food = foodService.insertFoodByFooId(UUID.randomUUID().toString(),"黄焖鸡","0.png",20,40,"很好吃吧");
        int i = foodDao.insertByFoods(food);
        assertEquals(i, 1);
    }

    @Test
    public void deleteTest(){
        int results = foodService.deleteFoodByFoodId("100010");
        if(results == 1) {
            System.out.println("删除成功！");
        }
        else {
            System.out.println("删除错误！");
        }
    }

    @Test
    public void updateFoodNameTest() {
        foodEntity food = foodService.updateFoodNameByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e","测试名称");
        if(food != null) {
            System.out.println("修改成功");
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void updateFoodImgTest() {
        foodEntity food = foodService.updateFoodImgByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e","null.png");
        if(food != null) {
            System.out.println("修改成功");
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void updateFoodPriceTest() {
        foodEntity food = foodService.updateFoodPriceByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e",99999);
        if(food != null) {
            System.out.println("修改成功");
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void updateFoodReserveTest() {
        foodEntity food = foodService.updateFoodReserveByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e",88888);
        if(food != null) {
            System.out.println("修改成功");
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void updateFoodDetailsTest() {
        foodEntity food = foodService.updateFoodDetailsByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e","测试详情");
        if(food != null) {
            System.out.println("修改成功");
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void queryTest() {
        foodEntity food = foodService.getByFoodId("4db39022-11d7-4ab7-8145-5f5e9ed0e87e");
        if(food != null) {
            System.out.print(food.getFoodName()+" ");
            System.out.print(food.getFoodImg()+" ");
            System.out.print(food.getFoodPrice()+" ");
            System.out.print(food.getFoodReserve()+" ");
            System.out.println(food.getFoodDetails());
        }
        else {
            System.out.println("ID不存在！");
        }
    }

    @Test
    public void queryFoodListByFoodName() {
        for (foodEntity foodEntity : foodDao.queryByFoodName("测试")) {
            System.out.println(foodEntity.getFoodName());
        }
    }
}
