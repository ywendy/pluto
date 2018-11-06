package com.pluto.sys.web.mapper;

import com.pluto.sys.web.AbstractTestMapper;
import com.pluto.sys.web.entity.SysUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author YJ
 * @date 2018/11/6 16:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SysUserMapperTest extends AbstractTestMapper {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Before
    public void init() {
        super.init();
    }

    @Test
    public void insertTest() {
        int result = sysUserMapper.insertSelective(sysUser);
        Assert.assertTrue(result == 1);
    }
    @Test
    public void selectTest(){
      int result =   sysUserMapper.insertSelective(sysUser);
        Assert.assertTrue(result == 1);
        Assert.assertNotNull(sysUser.getId());
        SysUser user = sysUserMapper.selectByPrimaryKey(sysUser.getId());
        Assert.assertNotNull(user);
        Assert.assertEquals(sysUser,user);
        Assert.assertEquals(sysUser.getLoginName(),LOGIN_NAME);
    }

}
