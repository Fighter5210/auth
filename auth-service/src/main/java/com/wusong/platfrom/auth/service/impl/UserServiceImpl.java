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
    public void saveUser(UserEntity userEntity){
        userMapper.insert(userEntity);
    }

    @Override
    public void saveUserDetail(UserDetailEntity userDetailEntity) {
        userDetailMapper.insert(userDetailEntity);
    }

    @Override
    public UserEntity getUser(Integer userId) {
        return userMapper.select(userId);
    }
}
