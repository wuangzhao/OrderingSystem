package com.angzhao.dao;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgDao {

    int insertHomeImg(String homeImgPath);

    int deleteHomeImg(String homeImgId);

    homeImgEntity queryHomeImg(String homeImgPath);

    List<homeImgEntity> queryAllImgName();

}
