package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Attendance {

    private Integer att_id;
    private Integer att_userId;
    private String att_username;
    private Integer att_workId;
    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date att_s_ban;
    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date att_x_ban;
    private Integer att_late;
    private Integer att_leave;
    private String att_remarks;

    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public Integer getAtt_userId() {
        return att_userId;
    }

    public void setAtt_userId(Integer att_userId) {
        this.att_userId = att_userId;
    }

    public String getAtt_username() {
        return att_username;
    }

    public void setAtt_username(String att_username) {
        this.att_username = att_username;
    }

    public Integer getAtt_workId() {
        return att_workId;
    }

    public void setAtt_workId(Integer att_workId) {
        this.att_workId = att_workId;
    }

    public Date getAtt_s_ban() {
        return att_s_ban;
    }

    public void setAtt_s_ban(Date att_s_ban) {
        this.att_s_ban = att_s_ban;
    }

    public Date getAtt_x_ban() {
        return att_x_ban;
    }

    public void setAtt_x_ban(Date att_x_ban) {
        this.att_x_ban = att_x_ban;
    }

    public Integer getAtt_late() {
        return att_late;
    }

    public void setAtt_late(Integer att_late) {
        this.att_late = att_late;
    }

    public Integer getAtt_leave() {
        return att_leave;
    }

    public void setAtt_leave(Integer att_leave) {
        this.att_leave = att_leave;
    }

    public String getAtt_remarks() {
        return att_remarks;
    }

    public void setAtt_remarks(String att_remarks) {
        this.att_remarks = att_remarks;
    }
}
