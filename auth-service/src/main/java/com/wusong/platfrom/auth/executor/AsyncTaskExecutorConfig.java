package com.wusong.platfrom.auth.executor;


/**
 * 异步任务执行器
 * @author: wangdy
 * @create: 2022/2/9 下午7:02
 **/
//@Configuration
//@Slf4j
//public class AsyncTaskExecutorConfig {
//    @Bean(destroyMethod = "shutdown")
//    @Qualifier(value = "asyncTaskExecutor")
//    public ThreadPoolExecutor asyncTaskExecutor() {
//        final ThreadPoolExecutor asyncTaskExecutor =
//                new ThreadPoolExecutor(
//                        20,
//                        60,
//                        60,
//                        TimeUnit.SECONDS,
//                        new LinkedBlockingDeque<>(10000),
//                        new ThreadFactoryBuilder().setNameFormat("async-task-executor-%d").setDaemon(true).build()
//                );
//        asyncTaskExecutor.setRejectedExecutionHandler((runnable, executor) -> {
//            if (!executor.isShutdown()) {
//                try {
//                    executor.getQueue().put(runnable);
//                } catch (InterruptedException ex) {
//                    log.error("asyncTaskExecutor exception occurs:", ex);
//                    Thread.currentThread().interrupt();
//                }
//            }
//        });
//        return asyncTaskExecutor;
//    }
//}
