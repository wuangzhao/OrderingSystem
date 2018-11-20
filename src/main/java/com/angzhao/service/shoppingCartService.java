package com.angzhao.service;

import com.angzhao.entity.shoppingCartEntity;
import com.angzhao.model.shoppingCartDetailModel;

public interface shoppingCartService {

    shoppingCartEntity getShoppingCartListByUserId(String userId);

    boolean addShoppingCartDetail(shoppingCartDetailModel shoppingCartDetailModel);

    boolean payment(String userId);
}
