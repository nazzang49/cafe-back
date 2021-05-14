package com.toy.platform.cafe.domain.cafe;

import com.toy.platform.cafe.response.ApiResponse;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(value = "/cafe")
@RequiredArgsConstructor
public class CafeController {

    private final CafeService cafeService;

    @ApiOperation(value = "카페 상세 조회")
    @GetMapping(value = "/detail")
    public ApiResponse<Void> detail() {
        return ApiResponse.success();
    }
}
