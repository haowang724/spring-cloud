package com.cq.wh.cloudadminservice.api;

import com.cq.wh.cloudadminservice.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @USER wh
 * @DATE 2018/10/8
 * @Description
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserApi {

   //@Autowired
   private SysUserDao sysUserDao;


}
