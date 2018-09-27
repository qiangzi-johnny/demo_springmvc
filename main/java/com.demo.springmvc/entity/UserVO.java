package com.demo.springmvc.entity;

import com.demo.springmvc.entity.User;

import java.io.Serializable;

/**
 * UserVO
 *
 * @author WuYuxiang
 * @date 2018/5/18
 */
public class UserVO extends User implements Serializable {

    private static final long serialVersionUID = -7748617048603567364L;

    private String sex;

    private String age;

    private String identityCode;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }
}
