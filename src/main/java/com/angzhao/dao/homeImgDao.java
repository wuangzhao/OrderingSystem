package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface homeImgDao {

    int insertHomeImg(String homeImgId);

    int deleteHomeImg(String homeImgId);

    int updateHomeImg(foodEntity food);

    List<String> queryAllImgName();


}
