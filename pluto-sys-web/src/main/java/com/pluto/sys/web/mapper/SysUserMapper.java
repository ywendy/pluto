package com.pluto.sys.web.mapper;


import com.pluto.sys.web.entity.SysUser;
import org.springframework.stereotype.Repository;


/**
 * @author aaa
 */
@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

}