import com.xiaxin.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    @Test
    public void testMybatis() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取到的是EmployeeMapper的代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        System.out.println(mapper.selectMapEmployee());

        System.out.println("================================================================");
        System.out.println(mapper.selectMapEmployee());
/*        //System.out.println(mapper.getClass().getName());
        //System.out.println(mapper.selectEmpById(1));
        Employee employee = new Employee(null, "九九九", "13559@qqq.com", 5000.0);
        System.out.println(employee);*/
/*        Employee employee = mapper.selectEmpById(1);
        System.out.println(employee);
        employee.setEmail("111111@q.com");
        mapper.updateEmployee(employee);
        mapper.deleteEmployee(3);
        System.out.println(mapper.selectAllEmployees());*/
        //System.out.println(mapper.selectEmpById(1));
    }
}
