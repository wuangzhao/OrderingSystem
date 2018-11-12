package com.angzhao.service;

import com.angzhao.entity.shoppingCart;

public interface shoppingCartService {

    shoppingCart getShoppingCartListByUserId(String userId);
}
