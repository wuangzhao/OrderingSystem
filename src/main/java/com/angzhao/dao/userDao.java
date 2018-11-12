package com.angzhao.dao;

import com.angzhao.entity.userEntity;

public interface userDao {

    /**
     *
     * @param userEntity
     * @return
     */


    int insertByUser(userEntity userEntity);

    int deleteByUser(String userId);

    int updateByUser(userEntity userEntity);

    userEntity queryByUser(String userId);

}
