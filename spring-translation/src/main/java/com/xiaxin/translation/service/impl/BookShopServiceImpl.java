package com.xiaxin.translation.service.impl;

import com.xiaxin.translation.dao.BookShopDao;
import com.xiaxin.translation.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookShopServiceImpl implements BookShopService {

    @Autowired
    private BookShopDao bookShopDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void purchase(String userId, String isbn) {
        //获取图书的价格
        Double bookPrice = bookShopDao.findBookPriceByIsbn(isbn);
        //更新图书的库存
        bookShopDao.updateBookStock(isbn);
        //更新用户账户的余额
        bookShopDao.updateUserAccount(userId, bookPrice);
    }

}
