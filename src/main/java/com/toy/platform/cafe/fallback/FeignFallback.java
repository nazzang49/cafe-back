package com.toy.platform.cafe.fallback;

import com.toy.platform.cafe.request.DjangoFeignClient;
import com.toy.platform.cafe.request.NaverFeignClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeignFallback implements DjangoFeignClient, NaverFeignClient {

    private final Throwable cause;

    public FeignFallback(Throwable cause) {
        log.error(cause.getLocalizedMessage());
        if (cause instanceof RuntimeException && "Hystrix circuit short-circuited and is OPEN".equals(cause.getLocalizedMessage())) {
        }
        this.cause = cause;
    }
}
