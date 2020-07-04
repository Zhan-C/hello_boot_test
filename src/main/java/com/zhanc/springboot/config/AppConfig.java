package com.zhanc.springboot.config;

import com.zhanc.springboot.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author: S.K.Cu
 * @email: zhanc1998@qq.com
 * @create: 2020/7/2   22:47
 * @explain:
 */

@SpringBootConfiguration
//一个配置类相当于一个xml文件
public class AppConfig {


    /*
    <bean id="user" class="com.zhanc.springboot.bean.User"></bean>
     */
//    @Bean
//    public User user() {
//        return new User(17, "阿创");
//    }
}
