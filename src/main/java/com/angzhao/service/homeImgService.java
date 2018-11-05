package com.angzhao.service;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgService {

    int insertHomeImg(String homeImgPath);

    int deleteHomeImg(int homeImgId);

    int updateHomeImg(int homeImgId,String homeImgPath);

    int queryHomeImg(int homeImgId);

    List<homeImgEntity> getAllImgName();
}
