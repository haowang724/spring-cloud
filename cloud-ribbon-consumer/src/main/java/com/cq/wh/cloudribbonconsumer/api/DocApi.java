package com.cq.wh.cloudribbonconsumer.api;

import com.cq.wh.cloudribbonconsumer.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wh
 * @Date: 2018/11/1 11:41
 * @Description:
 */
@RestController
public class DocApi {
    @Autowired
    private DocService docService;

    @GetMapping("/consumer")
    public String dc(){
        return  docService.getDc();
    }
}
