package com.pluto.sys.web.mapper;

import com.pluto.sys.web.entity.SysArea;

public interface SysAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    SysArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}