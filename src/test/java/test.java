import com.angzhao.enums.orderFormEnums;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class test {

    @Test
    public void test() {
        List<String> picList = new ArrayList<>();
        File path = new File("");
        System.out.println(path.getAbsolutePath());
        File picPath = new File(path.getAbsolutePath() + "/src/main/webapp/images/home");
        File[] showPicList = picPath.listFiles();
        for (int i = 0; i < showPicList.length; i++) {
            picList.add(showPicList[i].getName());
        }
        for (String s : picList) {
            System.out.println(s);
        }
    }

    @Test
    public void print() {
        File picPath = new File("");
        System.out.println(picPath.getAbsolutePath());
    }
}
