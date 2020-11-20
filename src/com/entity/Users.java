package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Users{

    private Integer u_id;
    private String u_name;
    private String workId;
    private Integer sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String phone;
    private String address;
    private Integer dep_id;
    private Integer pos_id;
    @DateTimeFormat(pattern = "HH:mm")
    private Date s_ban;
    @DateTimeFormat(pattern = "HH:mm")
    private Date x_ban;
    private String u_remarks;
    private String identityCard;
    private String password;
    private Integer u_state;
    private String dep_name;
    private String pos_name;

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public Date getS_ban() {
        return s_ban;
    }

    public void setS_ban(Date s_ban) {
        this.s_ban = s_ban;
    }

    public Date getX_ban() {
        return x_ban;
    }

    public void setX_ban(Date x_ban) {
        this.x_ban = x_ban;
    }

    public String getU_remarks() {
        return u_remarks;
    }

    public void setU_remarks(String u_remarks) {
        this.u_remarks = u_remarks;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getU_state() {
        return u_state;
    }

    public void setU_state(Integer u_state) {
        this.u_state = u_state;
    }
}
