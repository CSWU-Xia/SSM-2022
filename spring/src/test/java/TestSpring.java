import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.bean.Employee;
import com.xiaxin.spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestSpring {


    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean的方式一
        //Object stuZhenzhong = context.getBean("stuZhenzhong");
        //Student bean = context.getBean(Student.class);
        //System.out.println("stuZhenzhong = " + stuZhenzhong);
        //System.out.println("bean = " + bean);
        //Student stuZhenzhong = context.getBean("stuZhenzhong", Student.class);
        //System.out.println("stuZhenzhong = " + stuZhenzhong);
        //Student stuConstruct = context.getBean("stuConstruct", Student.class);
        //System.out.println("stuConstruct = " + stuConstruct);
        Student stuP = context.getBean("stuP", Student.class);
        System.out.println("stuP = " + stuP);
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*        Employee emp = context.getBean("emp", Employee.class);
        System.out.println("emp = " + emp);
        Dept dept1 = context.getBean("dept1", Dept.class);
        System.out.println("dept1 = " + dept1);*/
        Employee innerEmp = context.getBean("innerEmp", Employee.class);
        System.out.println("innerEmp = " + innerEmp);
    }

    /**
     * @param
     * @description: 测试datasource
     * @author xiaxin
     * @date 2022/12/19 17:25
     */
    @Test
    public void test03() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource datasource = context.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection connection = datasource.getConnection();
        System.out.println("connection = " + connection);
    }

    /**
     * @param
     * @description: 测试工厂bean
     * @author xiaxin
     * @date 2022/12/19 21:12
     */
    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        Dept factoryBean = context.getBean("factoryBean", Dept.class);
        System.out.println("factoryBean = " + factoryBean);
    }
}
