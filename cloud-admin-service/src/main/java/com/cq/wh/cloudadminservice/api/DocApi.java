package com.cq.wh.cloudadminservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocApi {
   @Autowired
   private DiscoveryClient discoveryClient;

   @RequestMapping(method = RequestMethod.GET,value = "/dc")
   public String dc(){
       try {
           Thread.sleep(5000L);
       } catch (InterruptedException e){
           e.printStackTrace();
       }
       String services = "Services: "+ discoveryClient.getServices();
       System.out.printf(services);
       return services;
   }
}
