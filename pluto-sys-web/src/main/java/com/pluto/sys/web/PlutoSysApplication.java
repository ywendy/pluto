package com.pluto.sys.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YJ
 * @date 2018/11/6 14:59
 */
@SpringBootApplication
@MapperScan("com.pluto.sys.web.mapper")
public class PlutoSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlutoSysApplication.class,args);
    }

}
