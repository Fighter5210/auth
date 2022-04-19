package com.wusong.platfrom.auth.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * javadoc UserClient
 * <p>
 *     商户交互接口
 * <p>
 * @author weng xiaoyong
 * @date 2021/9/8 10:42 AM
 * @version 1.0.0
 **/
@FeignClient(value = "userClient", url = "${platform.service.user-b}")
public interface UserClient {
//
//    @GetMapping(value = "/mmc/merchant/data")
//    RestResult<MerchantBo> find(@RequestParam(value = "merchantId") String merchantId);
}
