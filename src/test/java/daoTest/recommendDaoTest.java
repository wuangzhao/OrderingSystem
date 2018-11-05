package daoTest;


import com.angzhao.dao.foodDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.recommendService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class recommendDaoTest {

    /**
     *
     */

    @Autowired
    foodDao foodDao;

    @Autowired
    recommendService recommendService;

    public void insertRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        int i = recommendService.inserttRecommendFood(food);
        if(i == 1) {
            System.out.println("插入成功");
        }
        else {
            System.out.println("插入失败");
        }
    }

    public void deleteRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        int i = recommendService.deteleRecommendFood(food);
        if(i == 1) {
            System.out.println("删除成功");
        }
        else {
            System.out.println("删除失败");
        }
    }

    public void queryRecommendTest() {
        foodEntity food = foodDao.queryByFoodId("fd_1000a001");
        recommendService.queryRecommendFood(food);
    }
}
