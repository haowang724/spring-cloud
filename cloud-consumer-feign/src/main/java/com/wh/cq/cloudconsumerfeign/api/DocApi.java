package com.wh.cq.cloudconsumerfeign.api;

import com.wh.cq.cloudconsumerfeign.api.rpcservice.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wh
 * @Date: 2018/12/18 11:41
 * @Description:
 */
@RestController
public class DocApi {
    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc(){
        return  dcClient.consumer();
    }
}
