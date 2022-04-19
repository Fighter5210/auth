package com.wusong.platfrom.auth.web.interceptor;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * 请求认证拦截器
 * @author: wangdy
 * @create: 2022/2/9 下午7:31
 **/
public class AuthorizationInterceptor implements HandlerInterceptor {

//    private static final String CHANNEL_PREFIX = "/auth-web/channel";
//
//    private static final String MERCHANT_PREFIX = "/auth-web/merchant";
//
//    /**
//     * 先按照OAuth2.0标准处理
//     * <link>https://developer.mozilla.org/en-US/docs/Web/HTTP/Authentication#authentication_schemes</link>
//     * <link>https://datatracker.ietf.org/doc/html/rfc6750</link>
//     **/
//    public static final String AUTHORIZATION_KEY = "Authorization";
//
//    /**
//     * 先按照OAuth2.0标准处理
//     * <link>https://developer.mozilla.org/en-US/docs/Web/HTTP/Authentication#authentication_schemes</link>
//     * <link>https://datatracker.ietf.org/doc/html/rfc6750</link>
//     **/
//    public static final String AUTHORIZATION_VALUE_PREFIX = "Bearer ";
//
//    private static final String VERIFICATION_ERROR_MESSAGE = "token验证失败";
//
//
//    @Setter(onMethod_ = @Autowired)
//    private ChannelFilter channelFilter;
//
//    @Setter(onMethod_ = @Autowired)
//    private CommonFilter commonFilter;
//
//    @Setter(onMethod_ = @Autowired)
//    private MerchantFilter merchantFilter;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
//        final String url = request.getRequestURI();
//        String bearer = Cookies.findFirst(AUTHORIZATION_KEY, request);
//        if(StringUtils.isBlank(bearer)){
//            bearer = Headers.find(AUTHORIZATION_KEY, request);
//        }
//        if(StringUtils.isBlank(bearer)){
//            throw new AnyException("no authorized!");
//        }
//        final String token = StringUtils.removeStartIgnoreCase(bearer, AUTHORIZATION_VALUE_PREFIX);
//        if(StringUtils.startsWithIgnoreCase(url, CHANNEL_PREFIX)){
//            final NotNullTuple<TokenPayloadBo, ChannelUserBo> tuple = channelFilter.filter(token);
//            if(Objects.isNull(tuple)){
//                throw new AnyException(VERIFICATION_ERROR_MESSAGE);
//            }
//            AuthContextHolder.set(tuple.getV());
//            AuthContextHolder.setToken(tuple.getK());
//        }else if(StringUtils.startsWithIgnoreCase(url, MERCHANT_PREFIX)){
//            final NotNullTuple<TokenPayloadBo, MerchantUserBo> tuple = merchantFilter.filter(token);
//            if(Objects.isNull(tuple)){
//                throw new AnyException(VERIFICATION_ERROR_MESSAGE);
//            }
//            AuthContextHolder.set(tuple.getV());
//            AuthContextHolder.setToken(tuple.getK());
//        }else{
//            final NotNullTuple<TokenPayloadBo, UserBo> tuple = commonFilter.filter(token);
//            if(Objects.isNull(tuple)){
//                throw new AnyException(VERIFICATION_ERROR_MESSAGE);
//            }
//            AuthContextHolder.set(tuple.getV());
//            AuthContextHolder.setToken(tuple.getK());
//        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//        AuthContextHolder.remove();
//        AuthContextHolder.removeToken();
//    }
}
