package com.angzhao.service;

import com.angzhao.entity.homeImgEntity;

import java.util.List;

public interface homeImgService {

    int insertHomeImg();

    int deleteHomeImg();

    int updateHomeIMg();

    List<homeImgEntity> getAllImgName();
}
