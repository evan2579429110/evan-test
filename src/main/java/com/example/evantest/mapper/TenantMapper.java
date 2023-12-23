package com.example.evantest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.evantest.entity.Tenant;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TenantMapper extends BaseMapper<Tenant> {
}
