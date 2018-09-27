package com.demo.springmvc.entity;


import java.util.Date;

/**
 * User
 *
 * @author WuYuxiang
 * @date 2018/5/18
 */
public class User {

    private int id;
    private String username;
    private String password;
    private boolean status; //状态0正常1删除2禁用
    private Date date_update;  //更新时间
    private Date date_create;  //创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }



}
