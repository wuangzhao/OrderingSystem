package com.angzhao.dao;

import com.angzhao.model.shoppingCartDetailModel;

import java.util.List;

public interface shoppingCartDetailDao {

    int insert(shoppingCartDetailModel shoppingCartDetailModel);

    int delete(shoppingCartDetailModel shoppingCartDetailModel);

    int update(shoppingCartDetailModel shoppingCartDetailModel);

    shoppingCartDetailModel queryByFoodId(String foodId);

    List<shoppingCartDetailModel> queryByUserId(String userId);
}
