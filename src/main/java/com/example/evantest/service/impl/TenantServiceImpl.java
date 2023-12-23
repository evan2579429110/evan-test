package com.example.evantest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.evantest.entity.Tenant;
import com.example.evantest.mapper.TenantMapper;
import com.example.evantest.service.TenantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper,Tenant> implements TenantService {


    @Override
    public String index(){
        List<Tenant> a = baseMapper.selectList(null);
        for (Tenant data :a){
            System.out.println(data.getId());
        }
        return "1111";
    }

}
