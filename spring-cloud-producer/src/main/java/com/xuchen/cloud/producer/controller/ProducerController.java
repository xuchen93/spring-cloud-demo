package com.xuchen.cloud.producer.controller;

import com.xuchen.cloud.model.user.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProducerController {

    @Value("${appName}")
    String appName;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("接收到请求：{}", name);
        return appName + "："+name;
    }

    @PostMapping("/user")
    public UserModel user(@RequestBody UserModel userModel) {
        log.info("接收到请求：{}", userModel);
        userModel.setPhone("180****9036");
        return userModel;
    }
}
