/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author lenovo
 */
public class Worker {
    private int id;
    private String name;
    private String phone;
    private BigDecimal salaryPerday;
    private int daynumber;
    private BigDecimal bhxh;
    private BigDecimal bhtn;

    public Worker() {
    }

    public Worker(int id, String name, String phone, BigDecimal salaryPerday, int daynumber, BigDecimal bhxh, BigDecimal bhtn) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salaryPerday = salaryPerday;
        this.daynumber = daynumber;
        this.bhxh = bhxh;
        this.bhtn = bhtn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getSalaryPerday() {
        return salaryPerday;
    }

    public void setSalaryPerday(BigDecimal salaryPerday) {
        this.salaryPerday = salaryPerday;
    }

    public int getDaynumber() {
        return daynumber;
    }

    public void setDaynumber(int daynumber) {
        this.daynumber = daynumber;
    }

    public BigDecimal getBhxh() {
        return bhxh;
    }

    public void setBhxh(BigDecimal bhxh) {
        this.bhxh = bhxh;
    }

    public BigDecimal getBhtn() {
        return bhtn;
    }

    public void setBhtn(BigDecimal bhtn) {
        this.bhtn = bhtn;
    }
    
    
}
