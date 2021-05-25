package com.example.test.one.controller;

import com.example.test.one.feign.FeignTest;
import com.foody.net.commons.city.model.LocalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private FeignTest test;

    @GetMapping("test")
    public LocalModel test() {
        LocalModel localModel = new LocalModel();
        localModel.setDescriptionLocal(test.test());
        return localModel;
    }
}
