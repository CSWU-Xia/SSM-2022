import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaxin.mybatis.mbg.bean.Employee;
import com.xiaxin.mybatis.mbg.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestMbg {
    @Test
    public void test01() throws XMLParserException, IOException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void test02() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        Page<Object> page = PageHelper.startPage(2, 3);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectAll();
/*        System.out.println("page.getPages() = " + page.getPages());
        System.out.println("page.getTotal() = " + page.getTotal());
        System.out.println("page.getPageSize() = " + page.getPageSize());
        for (Object o : page.getResult()) {
            System.out.println("o = " + o);
        }*/
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 5);
        System.out.println("pageInfo.getNavigatePages() = " + pageInfo.getNavigatePages());
        System.out.println("pageInfo.getTotal() = " + pageInfo.getTotal());
        System.out.println("pageInfo.getPageSize() = " + pageInfo.getPageSize());
        for (Employee employee : pageInfo.getList()) {
            System.out.println("employee = " + employee);
        }
        System.out.println("pageInfo.getStartRow() = " + pageInfo.getStartRow());
        System.out.println("pageInfo.getEndRow() = " + pageInfo.getEndRow());
        System.out.println("pageInfo.getNavigateFirstPage() = " + pageInfo.getNavigateFirstPage());
        System.out.println("pageInfo.getNavigateLastPage() = " + pageInfo.getNavigateLastPage());
    }
}
