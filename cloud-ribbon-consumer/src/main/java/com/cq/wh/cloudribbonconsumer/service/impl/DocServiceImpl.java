package com.cq.wh.cloudribbonconsumer.service.impl;

import com.cq.wh.cloudribbonconsumer.service.DocService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wh
 * @Date: 2018/11/1 15:42
 * @Description:
 */
@Service
public class DocServiceImpl implements DocService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "docFallback")
    public String getDc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String docFallback(){
        return "ERROR";
    }
}
