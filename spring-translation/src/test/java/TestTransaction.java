import com.xiaxin.translation.config.SpringConfig;
import com.xiaxin.translation.service.BookShopService;
import com.xiaxin.translation.service.CashierService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@ContextConfiguration(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTransaction {
    @Autowired
    private BookShopService bookShopService;

    @Autowired
    private CashierService cashierService;

    @Test
    public void testTransaction() throws Exception {
        bookShopService.purchase("1", "1001");
    }


    /**
     * @param
     * @description: 测试声明式事务管理属性
     * Propagation.REQUIRES_NEW: 内部的多个事务不报错的可以成功
     * Propagation.REQUIRED:默认级别，全部通过才可提交否则全部失败
     * @author xiaxin
     * @date 2022/12/21 15:30
     */
    @Test
    public void testTransaction01() {
        List<String> isbns = new ArrayList<String>();
        isbns.add("1001");
        isbns.add("1002");
        cashierService.checkout("1", isbns);
    }
}
