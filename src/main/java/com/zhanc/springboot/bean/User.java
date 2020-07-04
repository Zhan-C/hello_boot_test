package com.zhanc.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author: S.K.Cu
 * @email: zhanc1998@qq.com
 * @create: 2020/7/2   22:48
 * @explain:
 */
@ConfigurationProperties(value = "user")
@Component
public class User implements Serializable {
    private Integer id;
    private String username;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.username = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
