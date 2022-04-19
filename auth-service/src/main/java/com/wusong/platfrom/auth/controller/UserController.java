/**
 * @ClassName TestController
 * @Description TODO
 * @Author xinyue
 * @Date 2022/4/2 下午3:14
 * @Version 1.0
 */
package com.wusong.platfrom.auth.controller;

import com.wusong.platfrom.auth.service.IUserService;
import com.wusong.web.dto.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/save")
    public ApiResult<Boolean> test() {
        userService.saveUser();
        userService.saveUserDetail();
        return ApiResult.ok(true);
    }
}
