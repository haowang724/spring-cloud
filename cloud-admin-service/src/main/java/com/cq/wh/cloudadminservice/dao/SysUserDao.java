package com.cq.wh.cloudadminservice.dao;

import com.cq.wh.cloudadminservice.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @USER wh
 * @DATE 2018/10/7
 * @Description
 */
public interface SysUserDao extends JpaRepository<SysUser,Long> {
}
