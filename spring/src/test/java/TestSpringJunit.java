import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.config.SpringConfig;
import com.xiaxin.spring.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定spring的配置路径
@ContextConfiguration(classes = {SpringConfig.class})
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpringJunit {
    @Autowired
    private DeptService deptService;

    @Test
    public void testSpring() throws Exception {
        deptService.save(new Dept());
    }

}
