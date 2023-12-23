package com.example.evantest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "`sys_tenant`")
public class Tenant {
//    private static final long serialVersionUID = 1L;
    private Long id;

}
