package com.pluto.sys.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aaa
 */
public class SysArea implements Serializable {
    private static final long serialVersionUID = 8174956510991122803L;
    private Integer id;

    private String code;

    private String parentCode;

    private Integer level;

    private String cName;

    private String eName;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;


}