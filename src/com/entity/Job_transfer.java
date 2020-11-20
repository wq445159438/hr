package com.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Job_transfer {

    private Integer jt_id;
    private Integer jt_userId;
    private String jt_ijt_username;
    private Integer jt_workId;
    private Integer jt_before_dep;
    private Integer jt_before_pos;
    private Integer jt_after_dep;
    private Integer jt_after_pos;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date jt_date;
    private String jt_remarks;

    public Integer getJt_id() {
        return jt_id;
    }

    public void setJt_id(Integer jt_id) {
        this.jt_id = jt_id;
    }

    public Integer getJt_userId() {
        return jt_userId;
    }

    public void setJt_userId(Integer jt_userId) {
        this.jt_userId = jt_userId;
    }

    public String getJt_ijt_username() {
        return jt_ijt_username;
    }

    public void setJt_ijt_username(String jt_ijt_username) {
        this.jt_ijt_username = jt_ijt_username;
    }

    public Integer getJt_workId() {
        return jt_workId;
    }

    public void setJt_workId(Integer jt_workId) {
        this.jt_workId = jt_workId;
    }

    public Integer getJt_before_dep() {
        return jt_before_dep;
    }

    public void setJt_before_dep(Integer jt_before_dep) {
        this.jt_before_dep = jt_before_dep;
    }

    public Integer getJt_before_pos() {
        return jt_before_pos;
    }

    public void setJt_before_pos(Integer jt_before_pos) {
        this.jt_before_pos = jt_before_pos;
    }

    public Integer getJt_after_dep() {
        return jt_after_dep;
    }

    public void setJt_after_dep(Integer jt_after_dep) {
        this.jt_after_dep = jt_after_dep;
    }

    public Integer getJt_after_pos() {
        return jt_after_pos;
    }

    public void setJt_after_pos(Integer jt_after_pos) {
        this.jt_after_pos = jt_after_pos;
    }

    public Date getJt_date() {
        return jt_date;
    }

    public void setJt_date(Date jt_date) {
        this.jt_date = jt_date;
    }

    public String getJt_remarks() {
        return jt_remarks;
    }

    public void setJt_remarks(String jt_remarks) {
        this.jt_remarks = jt_remarks;
    }
}
