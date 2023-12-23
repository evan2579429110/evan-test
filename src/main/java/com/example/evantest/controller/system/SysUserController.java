package com.example.evantest.controller.system;

import com.example.evantest.common.core.domain.R;
import com.example.evantest.common.exception.BusinessException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author evan
 * @since 2023-12-23
 */
@RestController
@AllArgsConstructor
@RequestMapping("/system/user")
public class SysUserController {

    @GetMapping("/index")
    public R Index() {
        System.out.println("==f=f=");

        return R.success("user");
    }

    @GetMapping("/index2")
    public String Index2() {
        return "fff";
    }

}
