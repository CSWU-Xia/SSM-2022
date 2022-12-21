package com.xiaxin.translation.service.impl;

import com.xiaxin.translation.service.BookShopService;
import com.xiaxin.translation.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CashierServiceImpl implements CashierService {
    @Autowired
    private BookShopService bookShopService;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void checkout(String userId, List<String> isbns) {
        for (String isbn : isbns) {
            System.out.println("isbn = " + isbn);
            bookShopService.purchase(userId, isbn);
        }
    }
}
