package com.wusong.platfrom.auth.config;

import org.springframework.context.annotation.Configuration;

/**
 * javadoc AppConfig
 * @author: wangdy
 * @create: 2022/2/10 下午2:20
 **/
@Configuration
public class AppConfig {

//    private RedisProperties redisProperties;
//
//    @Autowired
//    public AppConfig setRedisProperties(RedisProperties redisProperties) {
//        this.redisProperties = redisProperties;
//        return this;
//    }

//    /**
//     * javadoc redissonClient
//     *
//     * @return org.redisson.api.RedissonClient
//     * @apiNote 手动装配redisson client
//     * 特殊配置:
//     * 读写操作将使用更严格的超时时间设置
//     * 目前使用1秒timeout, 主要是为了防止服务器或者中间件不稳定导致cache不可用
//     * 严格来说, read write的time应控制在0~50ms
//     * @author weng xiaoyong
//     * @date 2021/5/27 5:49 PM
//     **/
//    @Bean
//    @Qualifier(value = "redissonClient")
//    public RedissonClient redissonClient() {
//        final Config config = new Config();
//        final ObjectMapper om = new ObjectMapper()
//                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY)
//                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
//                .registerModule(new JavaTimeModule())
//                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        config.setCodec(new JsonJacksonCodec(om))
//                .useSingleServer()
//                .setAddress("redis://" + redisProperties.getHost() + ":" + redisProperties.getPort())
//                .setPassword(redisProperties.getPassword())
//                .setDatabase(redisProperties.getDatabase())
//                .setTimeout(1000);
//        return Redisson.create(config);
//    }
}
