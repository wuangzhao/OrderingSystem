package com.angzhao.dao;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgDao {

    int insertHomeImg(homeImgEntity homeImg);

    int deleteHomeImg(String homeImgId);

    int updateHomeImg(homeImgEntity homeImg);

    List<homeImgEntity> queryAllImgName();

}
