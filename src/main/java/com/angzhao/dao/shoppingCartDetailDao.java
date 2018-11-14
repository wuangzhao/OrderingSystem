package com.angzhao.dao;

import com.angzhao.entity.shoppingCartDetail;

import java.util.List;

public interface shoppingCartDetailDao {

    int insert(shoppingCartDetail shoppingCartDetail);

    int delete(shoppingCartDetail shoppingCartDetail);

    int update(shoppingCartDetail shoppingCartDetail);

    shoppingCartDetail queryByFoodId(String foodId);

    List<shoppingCartDetail> queryByUserId(String userId);
}
