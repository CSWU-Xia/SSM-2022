package com.xiaxin.translation.dao;

public interface BookShopDao {
    //1.根据书号查询书的价格
    Double findBookPriceByIsbn(String isbn);

    //2.根据书号修改书的库存（需求：每次只能买一本书，如库存为0，则抛出异常）
    void updateBookStock(String isbn);

    //3.根据书的价格修改用户的余额（需求：如果余额不足，则抛出异常）
    void updateUserAccount(String username, Double price);
}
