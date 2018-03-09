package com.didispace.study.domain;

import java.io.Serializable;

/**
 * Created by lh on 2018/3/9.
 */
public class HiphopMan implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public HiphopMan(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
