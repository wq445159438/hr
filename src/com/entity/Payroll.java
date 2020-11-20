package com.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Payroll {

    private Integer pay_id;
    private Integer pay_userId;
    private String pay_username;
    private Integer pay_workId;
    private Integer pay_grossPay;
    private Integer pay_bonus;
    private Integer pay_fine;
    private Integer pay_netSalary;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pay_date;
    private String pay_remarks;

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    public Integer getPay_userId() {
        return pay_userId;
    }

    public void setPay_userId(Integer pay_userId) {
        this.pay_userId = pay_userId;
    }

    public String getPay_username() {
        return pay_username;
    }

    public void setPay_username(String pay_username) {
        this.pay_username = pay_username;
    }

    public Integer getPay_workId() {
        return pay_workId;
    }

    public void setPay_workId(Integer pay_workId) {
        this.pay_workId = pay_workId;
    }

    public Integer getPay_grossPay() {
        return pay_grossPay;
    }

    public void setPay_grossPay(Integer pay_grossPay) {
        this.pay_grossPay = pay_grossPay;
    }

    public Integer getPay_bonus() {
        return pay_bonus;
    }

    public void setPay_bonus(Integer pay_bonus) {
        this.pay_bonus = pay_bonus;
    }

    public Integer getPay_fine() {
        return pay_fine;
    }

    public void setPay_fine(Integer pay_fine) {
        this.pay_fine = pay_fine;
    }

    public Integer getPay_netSalary() {
        return pay_netSalary;
    }

    public void setPay_netSalary(Integer pay_netSalary) {
        this.pay_netSalary = pay_netSalary;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public String getPay_remarks() {
        return pay_remarks;
    }

    public void setPay_remarks(String pay_remarks) {
        this.pay_remarks = pay_remarks;
    }
}
