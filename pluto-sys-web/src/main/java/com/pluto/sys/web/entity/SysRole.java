package com.pluto.sys.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aaa
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -9107414936481788061L;
    private Long id;

    private String name;

    private String desc;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;


}