package com.wusong.platfrom.auth.service;


import com.wusong.platfrom.auth.entity.UserDetailEntity;
import com.wusong.platfrom.auth.entity.UserEntity;

public interface IUserService {
     void saveUser(UserEntity userEntity);
     void saveUserDetail(UserDetailEntity userDetailEntity);
    UserEntity getUser(Integer userId);
}
