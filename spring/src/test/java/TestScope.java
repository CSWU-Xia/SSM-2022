import com.xiaxin.spring.bean.Dept;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
        Dept dept = context.getBean("dept", Dept.class);
        Dept dept1 = context.getBean("dept", Dept.class);
        System.out.println("dept==dept1 = " + (dept == dept1));
    }
}
