package com.example.test.one.controller;

import com.example.test.one.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private FeignTest test;

    @GetMapping("test")
    public String test() {
        return test.test();
    }
}
