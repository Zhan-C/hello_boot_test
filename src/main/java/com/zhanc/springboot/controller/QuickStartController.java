package com.zhanc.springboot.controller;

import com.zhanc.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: S.K.Cu
 * @email: zhanc1998@qq.com
 * @create: 2020/7/1   10:59
 * @explain:
 */
@RestController
public class QuickStartController {

    @Autowired
    User user;

    @Value("${user.username}")
    String va;

    @RequestMapping("/quick")
    public String quick() {
        System.out.println(user);
        System.out.println(va);
        return "springboot 访问成功!----------阿创------";
    }

}
