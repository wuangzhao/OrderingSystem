package com.angzhao.service.Impl;

import com.angzhao.dao.foodDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class foodServiceImpl implements foodService {

    @Autowired
    foodDao foodDao;

    @Override
    public foodEntity insertFoodByFooId(String foodId,String foodName,String foodImg,int foodPrice,int foodReserve,String foodDetails) {
        foodEntity food = new foodEntity();
        foodEntity food1 = foodDao.queryByFoodId(foodId);
        if (food1 == null) {
            food.setFoodId(foodId);
            food.setFoodName(foodName);
            food.setFoodImg(foodImg);
            food.setFoodDetails(foodDetails);
            food.setFoodPrice(foodPrice);
            food.setFoodReserve(foodReserve);
            return food;
        }
        else {
            System.out.println("插入信息有误！");
            return null;
        }
     }

    @Override
    public int deleteFoodByFoodId(String foodId) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if(food != null) {
            foodDao.deleteByFoods(foodId);
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    //更改名称
    public foodEntity updateFoodNameByFoodId(String foodId, String foodName) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if (food == null) {
            return null;
        } else {
            food.setFoodName(foodName);
            foodDao.updateByFoods(food);
        }
        if (foodDao.updateByFoods(food) == 1) {
            return food;
        } else {
            return null;
        }
    }

    @Override
    //更改详情
    public foodEntity updateFoodDetailsByFoodId(String foodId, String foodDetails) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if (food == null) {
            return null;
        } else {
            food.setFoodDetails(foodDetails);
            foodDao.updateByFoods(food);
        }
        if (foodDao.updateByFoods(food) == 1) {
            return food;
        } else {
            return null;
        }
    }

    @Override
    //更改图片
    public foodEntity updateFoodImgByFoodId(String foodId, String foodImg) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if (food == null) {
            return null;
        } else {
            food.setFoodImg(foodImg);
            foodDao.updateByFoods(food);
        }
        if (foodDao.updateByFoods(food) == 1) {
            return food;
        } else {
            return null;
        }
    }

    @Override
    //更改价格
    public foodEntity updateFoodPriceByFoodId(String foodId, int foodPrice) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if (food == null) {
            return null;
        } else {
            food.setFoodPrice(foodPrice);
            foodDao.updateByFoods(food);
        }
        if (foodDao.updateByFoods(food) == 1) {
            return food;
        } else {
            return null;
        }
    }

    @Override
    //更改库存
    public foodEntity updateFoodReserveByFoodId(String foodId, int foodReserve) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if (food == null) {
            return null;
        } else {
            food.setFoodReserve(foodReserve);
            foodDao.updateByFoods(food);
        }
        if (foodDao.updateByFoods(food) == 1) {
            return food;
        } else {
            return null;
        }
    }

    @Override
    //查询
    public foodEntity getByFoodId(String foodId) {
        foodEntity food = foodDao.queryByFoodId(foodId);
        if(food != null) {
            return food ;
        }
        else{
            return null;
        }
    }

    @Override
    public List<foodEntity> getFoodListByFoodName(String foodName) {
        return foodDao.queryByFoodName(foodName);
    }
}
