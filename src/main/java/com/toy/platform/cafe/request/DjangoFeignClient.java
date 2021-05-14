package com.toy.platform.cafe.request;

import com.toy.platform.cafe.config.FeignConfig;
import com.toy.platform.cafe.fallback.FeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="DjangoApiFeign",
        url="${django.api-url}",
        configuration = {FeignConfig.class},
        fallbackFactory = FeignFallbackFactory.class)
public interface DjangoFeignClient {

}
