package com.wusong.platfrom.auth.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wusong.platfrom.auth.entity.UserDetailEntity;
import com.wusong.platfrom.auth.entity.UserEntity;

@DS("sharding")
public interface UserDetailMapper extends BaseMapper<UserDetailEntity> {
    
    @Override
    int insert(UserDetailEntity userDetailEntity);
}
