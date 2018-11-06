package com.pluto.sys.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aaa
 */
public class SysDept implements Serializable {
    private static final long serialVersionUID = -3440671802912359342L;
    private Long id;

    private String deptNo;

    private String name;

    private String parentNo;

    private Date createTime;

    private Long createBy;

    private Long updateBy;

    private Date updateTime;


}