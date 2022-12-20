import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.config.SpringConfig;
import com.xiaxin.spring.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {

    @Test
    public void testConfiguration() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DeptServiceImpl service = context.getBean("deptService", DeptServiceImpl.class);
        service.save(new Dept());
    }
}
