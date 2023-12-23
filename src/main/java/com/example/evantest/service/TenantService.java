package com.example.evantest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.evantest.entity.Tenant;

public interface TenantService extends IService<Tenant>
{
    String index();

}
