package com.wusong.platfrom.auth.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthFilter {
//
//    @Setter(onMethod_ = @Autowired)
//    private UserSpi authSpi;
//
//    @Setter(onMethod_ = @Autowired)
//    private TokenSpi tokenSpi;
//
//    public NotNullTuple<TokenPayloadBo, MerchantUserBo> filter(String token) {
//        if(StringUtils.isBlank(token)){
//            log.error("MerchantUserFilter.filter({}) token 参数不合法", token);
//            return null;
//        }
//        final TokenPayloadBo bo = tokenSpi.parse(new TokenBo().setToken(token)).successfullyGet();
//        if(Objects.isNull(bo)){
//            log.error("TokenSpi.parse({}) 解析失败", token);
//            return null;
//        }
//
//        if(StringUtils.isBlank(bo.getMerchantId())){
//            log.error("TokenPayloadBo.filter({}) 商户信息不合法", bo);
//            return null;
//        }
//        final MerchantUserBo merchantUser = authSpi.find(
//                new SimpleMerchantUserQueryBo().setMerchantId(bo.getMerchantId()).setUserId(bo.getUserId())
//        ).successfullyGet();
//
//        if(Objects.isNull(merchantUser)){
//            log.error("UserSpi.find({}, {}) 商户用户中心无法找到该用户", bo.getUserId(), bo.getMerchantId());
//            return null;
//        }
//        return NotNullTuple.of(bo, merchantUser);
//    }
}
