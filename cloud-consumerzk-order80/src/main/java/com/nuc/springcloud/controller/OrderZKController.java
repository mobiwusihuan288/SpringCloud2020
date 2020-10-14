package com.nuc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author mobiw
 * @email mobiwusihuan288@163.com
 * @date 2020-10-07 16:51
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment() {
        String result = restTemplate.getForObject(INVOME_URL + "/payment/zk", String.class);
        return result;
    }


}
