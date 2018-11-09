package daoTest;

import com.angzhao.dao.homeImgDao;
import com.angzhao.entity.homeImgEntity;
import com.angzhao.service.homeImgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class homeImgDaoTest {

    @Autowired
    homeImgDao homeImgDao;

    @Autowired
    homeImgService homeImgService;

    /**
     *
     */

    @Test
    public void insertHomeImgTest() {
        String  a = "27.png";
        homeImgEntity homeImgEntity =  homeImgService.insertHomeImg(a);
        homeImgEntity homeImgEntity1 = homeImgDao.queryHomeImg(a);
        assertEquals(homeImgEntity.getHomeImgPath().trim(),homeImgEntity1.getHomeImgPath().trim());
    }

    @Test
    public void deleteHomeImgTest() {
       int i = homeImgService.deleteHomeImg("00.png");
        assertEquals(i,1);
    }


    @Test
    public void queryHomeImgTest() {
        homeImgEntity homeImgEntity = homeImgService.queryHomeImg("2.png");
        homeImgEntity homeImgEntity1 = homeImgDao.queryHomeImg("2.png");
        assertEquals(homeImgEntity,homeImgEntity1);
    }

    @Test
    public void getAllListTest(){
        List<homeImgEntity> list = homeImgDao.queryAllImgName();
        for (homeImgEntity s : list) {
            System.out.println(s.getHomeImgPath());
        }
    }
}
