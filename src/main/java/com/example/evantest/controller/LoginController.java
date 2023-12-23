package com.example.evantest.controller;

import com.example.evantest.common.utils.JwtUtils;
import com.example.evantest.model.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private JwtUtils jwtUtils;


    @GetMapping("login")
    public String login(LoginDto user) {

        // 生成token
        LoginDto userInfo = new LoginDto();
        userInfo.setUserName("admin");
        return jwtUtils.generateToken(userInfo);
    }

    @GetMapping("check/{token}")
    public boolean CheckToken(@PathVariable("token") String token) {
        return jwtUtils.isTokenExpired(token);
    }

}
