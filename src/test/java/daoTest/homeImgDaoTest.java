package daoTest;

import com.angzhao.dao.homeImgDao;
import com.angzhao.entity.homeImgEntity;
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

    @Test
    public void getAllListTest(){
        List<homeImgEntity> list = homeImgDao.queryAllImgName();
        for (homeImgEntity s : list) {
            System.out.println(s.getHomeImgPath());
        }
    }
}
