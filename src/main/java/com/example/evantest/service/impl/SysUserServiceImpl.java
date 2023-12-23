package com.example.evantest.service.impl;

import com.example.evantest.entity.SysUser;
import com.example.evantest.mapper.SysUserMapper;
import com.example.evantest.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author evan
 * @since 2023-12-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
