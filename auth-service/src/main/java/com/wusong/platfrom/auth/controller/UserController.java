/**
 * @ClassName TestController
 * @Description TODO
 * @Author xinyue
 * @Date 2022/4/2 下午3:14
 * @Version 1.0
 */
package com.wusong.platfrom.auth.controller;

import com.wusong.platfrom.auth.entity.UserDetailEntity;
import com.wusong.platfrom.auth.entity.UserEntity;
import com.wusong.platfrom.auth.service.IUserService;
import com.wusong.web.dto.ApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping("/save")
    public ApiResult<Boolean> saveUser(@RequestBody UserEntity userEntity) {
        userService.saveUser(userEntity);
        return ApiResult.ok(true);
    }
    
    @PostMapping("/detail/save")
    public ApiResult<Boolean> saveUserDetail(@RequestBody UserDetailEntity userDetailEntity) {
        userService.saveUserDetail(userDetailEntity);
        return ApiResult.ok(true);
    }

    @GetMapping("/get")
    public ApiResult<UserEntity> getUser(Integer userId) {
        return ApiResult.ok(userService.getUser(userId));
    }
}
