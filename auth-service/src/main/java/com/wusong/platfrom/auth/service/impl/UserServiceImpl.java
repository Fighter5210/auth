package com.wusong.platfrom.auth.service.impl;

import com.wusong.platfrom.auth.entity.UserDetailEntity;
import com.wusong.platfrom.auth.entity.UserEntity;
import com.wusong.platfrom.auth.mapper.UserDetailMapper;
import com.wusong.platfrom.auth.mapper.UserMapper;
import com.wusong.platfrom.auth.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    UserMapper userMapper;
    @Resource
    UserDetailMapper userDetailMapper;
    
    @Override
    public void saveUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(11).setUserName("用户2");
        userMapper.insert(userEntity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveUserDetail() {
        UserDetailEntity userDetailEntity = new UserDetailEntity();
        userDetailEntity.setUserId(10).setUserWork("工作1");
        userDetailMapper.insert(userDetailEntity);
    }
}
