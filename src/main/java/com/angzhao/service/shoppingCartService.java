package com.angzhao.service;

import com.angzhao.entity.shoppingCart;
import com.angzhao.entity.shoppingCartDetail;

public interface shoppingCartService {

    shoppingCart getShoppingCartListByUserId(String userId);

    boolean addShoppingCartDetail(shoppingCartDetail shoppingCartDetail);

    boolean payment(String userId);
}
