package com.example.evantest;

import com.example.evantest.entity.Tenant;
import com.example.evantest.mapper.TenantMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
public class TenantTest {
    @Autowired
    private TenantMapper te;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Tenant> list = te.selectList(null);
        list.forEach(System.out::println);

    }

}
