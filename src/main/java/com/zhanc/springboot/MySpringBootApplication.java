package com.zhanc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: S.K.Cu
 * @email: zhanc1998@qq.com
 * @create: 2020/7/1   10:58
 * @explain:
 */
@SpringBootApplication
@EnableScheduling//启动任务调度
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
