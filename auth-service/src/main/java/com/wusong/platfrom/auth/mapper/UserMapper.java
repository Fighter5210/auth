package com.wusong.platfrom.auth.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wusong.platfrom.auth.entity.UserDetailEntity;
import com.wusong.platfrom.auth.entity.UserEntity;

@DS("sharding")
public interface UserMapper extends BaseMapper<UserEntity> {
    /**
     * 新增数据
     *
     * @param userEntity 实例对象
     * @return 影响行数
     */
    @Override
    int insert(UserEntity userEntity);
}
