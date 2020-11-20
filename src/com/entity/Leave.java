package com.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Leave {

    private Integer lea_id;
    private Integer lea_userId;
    private String lea_username;
    private Integer lea_workId;
    private Integer lea_dep;
    private Integer lea_pos;
    private Integer lea_type;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lea_date;
    private Integer lea_days;
    private Integer lea_state;
    private String lea_remarks;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date filing_date;
    private String lea_reason;

    public Integer getLea_id() {
        return lea_id;
    }

    public void setLea_id(Integer lea_id) {
        this.lea_id = lea_id;
    }

    public Integer getLea_userId() {
        return lea_userId;
    }

    public void setLea_userId(Integer lea_userId) {
        this.lea_userId = lea_userId;
    }

    public String getLea_username() {
        return lea_username;
    }

    public void setLea_username(String lea_username) {
        this.lea_username = lea_username;
    }

    public Integer getLea_workId() {
        return lea_workId;
    }

    public void setLea_workId(Integer lea_workId) {
        this.lea_workId = lea_workId;
    }

    public Integer getLea_dep() {
        return lea_dep;
    }

    public void setLea_dep(Integer lea_dep) {
        this.lea_dep = lea_dep;
    }

    public Integer getLea_pos() {
        return lea_pos;
    }

    public void setLea_pos(Integer lea_pos) {
        this.lea_pos = lea_pos;
    }

    public Integer getLea_type() {
        return lea_type;
    }

    public void setLea_type(Integer lea_type) {
        this.lea_type = lea_type;
    }

    public Date getLea_date() {
        return lea_date;
    }

    public void setLea_date(Date lea_date) {
        this.lea_date = lea_date;
    }

    public Integer getLea_days() {
        return lea_days;
    }

    public void setLea_days(Integer lea_days) {
        this.lea_days = lea_days;
    }

    public Integer getLea_state() {
        return lea_state;
    }

    public void setLea_state(Integer lea_state) {
        this.lea_state = lea_state;
    }

    public String getLea_remarks() {
        return lea_remarks;
    }

    public void setLea_remarks(String lea_remarks) {
        this.lea_remarks = lea_remarks;
    }

    public Date getFiling_date() {
        return filing_date;
    }

    public void setFiling_date(Date filing_date) {
        this.filing_date = filing_date;
    }

    public String getLea_reason() {
        return lea_reason;
    }

    public void setLea_reason(String lea_reason) {
        this.lea_reason = lea_reason;
    }
}
