package com.angzhao.service;

import com.angzhao.entity.userEntity;

public interface userService {

    userEntity insertUser(userEntity userEntity);

    int deleteUser(String userId);

    userEntity uodataUser(userEntity userEntity);

    userEntity queryUser(String userId);

}
