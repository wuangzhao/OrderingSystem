package com.angzhao.service.Impl;

import com.angzhao.dao.userDao;
import com.angzhao.entity.userEntity;
import com.angzhao.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {


    @Autowired
    userDao userDao;


    @Override
    public userEntity insertUser(userEntity userEntity) {
        userDao.insertByUser(userEntity);
        return userEntity;
    }



    @Override
    public int deleteUser(String userId) {
        return 0;
    }

    public userEntity updateUser(userEntity userEntity) {
        return null;
    }

    @Override
    public userEntity queryUser(String userId) {
        return userDao.queryByUser(userId);
    }

    @Override
    public userEntity getUserByUserName(String userName) {
        return userDao.queryByUserName(userName);
    }

    @Override
    public userEntity getUserByUserTel(String userTel) {
        return userDao.queryByUserTel(userTel);
    }


}
