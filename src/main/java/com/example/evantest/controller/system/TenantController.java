package com.example.evantest.controller.system;


import com.example.evantest.service.TenantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/system/tenant")
public class TenantController {


    @Autowired
    private TenantService tenantService;

    /**
     * @Desc: 租户列表
     */
    @GetMapping("/index")
    public String Index() {
        System.out.println(("----- selectAll method test ------"));
        return tenantService.index();
//        List<Tenant> list = tenantMapper.selectList(null);
//        list.forEach(System.out::println);
//        return "aaaa";
    }

}
