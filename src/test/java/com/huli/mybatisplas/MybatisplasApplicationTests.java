package com.huli.mybatisplas;

import com.huli.mybatisplas.domain.SysUser;
import com.huli.mybatisplas.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class MybatisplasApplicationTests {

    @Autowired
    private SysUserMapper userMapper;

    @Test
    void contextLoads() {
        SysUser sysUser = new SysUser(null, "小明", "武汉", new Date());
        int insert = userMapper.insert(sysUser);
        System.out.println(insert);

    }

    @Test
    void sell(){
        SysUser sysUser = userMapper.selectByPrimaryKey(5);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(sysUser.getBirth());
        System.out.println(format);
        System.out.println(sysUser);
    }

}
