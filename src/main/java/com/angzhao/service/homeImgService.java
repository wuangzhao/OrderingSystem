package com.angzhao.service;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgService {

    homeImgEntity insertHomeImg(String homeImgPath);

    int deleteHomeImg(String homeImgPath);

    homeImgEntity queryHomeImg(String homeImgPath);

    List<homeImgEntity> getAllImgName();
}
