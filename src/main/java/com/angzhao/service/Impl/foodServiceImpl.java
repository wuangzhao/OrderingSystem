package com.angzhao.service.Impl;

import com.angzhao.dao.foodDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class foodServiceImpl implements foodService {

    @Autowired
    foodDao foodDao;

    @Override
    public foodEntity getByFoodId(String foodId) {
        return foodDao.queryByFoodId(foodId);
    }


}
