package com.angzhao.dao;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgDao {

    /**
     *
     * @param homeImgPath
     * @return
     */

    int insertHomeImg(String homeImgPath);

    int deleteHomeImg(String homeImgPath);

    homeImgEntity queryHomeImg(String homeImgPath);

    List<homeImgEntity> queryAllImgName();

}
