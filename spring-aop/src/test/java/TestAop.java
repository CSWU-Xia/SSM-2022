import com.xiaxin.aop.config.SpringConfig;
import com.xiaxin.aop.service.Calc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAop {
    @Autowired
    private Calc calc;

    @Test
    public void testAop() {
        System.out.println("结果为： " + calc.div(5, 0));
    }
}
