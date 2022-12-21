package com.xiaxin.translation.service;

import java.util.List;

public interface CashierService {
    void checkout(String userId, List<String> isbns);
}
