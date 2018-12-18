package com.wh.cq.cloudconsumerfeign.api.rpcservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Berton
 * @Date: 2018/12/18 15:39
 * @Description:
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
