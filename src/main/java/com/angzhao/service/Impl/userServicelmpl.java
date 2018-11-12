package com.angzhao.service.Impl;

import com.angzhao.dao.userDao;
import com.angzhao.entity.userEntity;
import com.angzhao.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServicelmpl implements userService {


    @Autowired
    userDao userDao;


    @Override
    public userEntity insertUser(userEntity userEntity) {
        return null;
    }



    @Override
    public int deleteUser(String userId) {
        return 0;
    }

    @Override
    public userEntity uodataUser(userEntity userEntity) {
        return null;
    }

    @Override
    public userEntity queryUser(String userId) {
        return null;
    }


}
