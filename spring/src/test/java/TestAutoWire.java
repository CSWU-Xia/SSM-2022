import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

    @Test
    public void testAutoWire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        DeptServiceImpl deptService = context.getBean("deptService", DeptServiceImpl.class);
        deptService.save(new Dept());
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireContext.xml");
        DeptServiceImpl bean = context.getBean(DeptServiceImpl.class);
        bean.save(new Dept());
    }
}
