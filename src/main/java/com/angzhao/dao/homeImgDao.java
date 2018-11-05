package com.angzhao.dao;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgDao {

    int insertHomeImg(homeImgEntity homeImg);

    int deleteHomeImg(int homeImgId);

    int updateHomeImg(homeImgEntity homeImg);

    homeImgEntity queryHomeImg(int homeImgId);

    List<homeImgEntity> queryAllImgName();

}
