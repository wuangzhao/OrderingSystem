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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class homeImgDaoTest {

    @Autowired
    homeImgDao homeImgDao;

    @Autowired
    homeImgService homeImgService;

    @Test
    public void insertTest() {
        int i = homeImgService.insertHomeImg("0.png");
        if(i == 1) {
            System.out.println("插入成功");
        }
        else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void deteleHomeImg() {
       int i = homeImgService.deleteHomeImg(100001);
        if(i == 1) {
            System.out.println("删除成功");
        }
        else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void updateHomeImg() {
        homeImgService.updateHomeImg(100001,"22.png");
    }

    @Test
    public void queryHomeImg() {
        homeImgService.queryHomeImg(100001);
    }

    @Test
    public void getAllListTest() {
        List<homeImgEntity> list = homeImgDao.queryAllImgName(100001);
        for (homeImgEntity s : list) {
            System.out.println(s);
        }
    }
}
