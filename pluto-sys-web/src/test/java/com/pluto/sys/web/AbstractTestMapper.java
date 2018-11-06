package com.pluto.sys.web;

import com.pluto.sys.web.entity.SysUser;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.util.Date;

/**
 * @author YJ
 * @date 2018/11/6 16:39
 */
public abstract class AbstractTestMapper extends AbstractTransactionalJUnit4SpringContextTests {

    protected SysUser sysUser;
    protected final static byte GENDER = 1;
    protected final static String LOGIN_NAME = "wendy";
    protected final static String NAME = "tonyN";
    protected final static Date BIRTHDAY = new Date();

    protected void init() {
        sysUser = new SysUser();
        sysUser.setGender(GENDER);
        sysUser.setLoginName(LOGIN_NAME);
        sysUser.setBirthday(BIRTHDAY);
        sysUser.setName(NAME);
    }


}
