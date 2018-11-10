package com.angzhao.service.Impl;

import com.angzhao.dao.salesDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.salesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class salesServiceImpl implements salesService {

    @Autowired
    salesDao salesDao;

    @Override
    public foodEntity insertSalesFood(foodEntity food) {
        int i = salesDao.insertSalesId(food);
        if (i == 1) {
            return food;
        }
        else {
            return null;
        }
    }

    @Override
    public foodEntity deleteSalesFood(foodEntity food) {
        int i = salesDao.deleteSalesId(food);
        if (i == 1) {
            return food;
        }
        else {
            return null;
        }
    }

    @Override
    public foodEntity querySalesFood(foodEntity food) {
        return salesDao.querySalesId(food);
    }


}
