package com.example.evantest.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "LoginDTO", description = "登录实体")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private static final long serialVersionUID = 1L;

    /** 用户名 */
    @ApiModelProperty(value = "用户名",required = true)
    private String userName;
}
