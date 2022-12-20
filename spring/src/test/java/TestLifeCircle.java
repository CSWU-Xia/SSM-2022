import com.xiaxin.spring.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCircle {

    /**
     * bean的声明周期
     * 1.构造方法
     * 2.设置id属性值
     * 3.初始化方法
     * 4.使用方法 = Person{id=1, name='张三'}
     * 5.销毁方法
     */
    @Test
    public void testLifeCircle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifeCircle.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println("使用方法 = " + person);
        ((ConfigurableApplicationContext) context).close();
    }
}
