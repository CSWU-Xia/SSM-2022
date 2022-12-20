import com.xiaxin.beforeaop.config.Springconfig;
import com.xiaxin.beforeaop.proxy.MyProxy;
import com.xiaxin.beforeaop.service.Calc;
import com.xiaxin.beforeaop.service.impl.CalcImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Springconfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBeforeAop {
    @Autowired
    private Calc calc;

    @Test
    public void testBeforeAop() {
        calc.add(2, 5);
    }


    /**
     * 测试代理
     */
    @Test
    public void testProxy() {
        Calc calc = new CalcImpl();
        MyProxy myProxy = new MyProxy(calc);
        calc = (Calc) myProxy.getProxyObject();
        calc.add(1, 3);
    }

}
