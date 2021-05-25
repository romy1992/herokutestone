package com.example.test.one.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "test-two",
        contextId = "feignTest")
public interface FeignTest {

    @GetMapping("test")
    String test();
}
