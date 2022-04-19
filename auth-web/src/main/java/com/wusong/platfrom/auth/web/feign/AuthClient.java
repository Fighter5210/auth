package com.wusong.platfrom.auth.web.feign;

import com.wusong.platfrom.auth.spi.UserSpi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "auth-service", qualifier = "authSpi")
public interface AuthClient extends UserSpi {
}
