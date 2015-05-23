/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;
import java.sql.Date;

/**
 *客户类
 * @author Zeming
 */
public class Customer implements Serializable{

    private Integer id;
    private Integer cash;//充值费用或余额
    private Integer ctype;//客户类型 1.VIP 2.普通客户
    private String cardNo;//客户编号
    private Date registerDate;//添加时间
    private Integer state;//卡的状态 1. 在用  0.空闲

    public Customer() {
    }

     public Customer( Integer cash, Integer ctype, String cardNo, Date registerDate, Integer state) {
        this.cash = cash;
        this.ctype = ctype;
        this.cardNo = cardNo;
        this.registerDate = registerDate;
        this.state = state;
    }
    
    public Customer(Integer id, Integer cash, Integer ctype, String cardNo, Date registerDate, Integer state) {
        this.id = id;
        this.cash = cash;
        this.ctype = ctype;
        this.cardNo = cardNo;
        this.registerDate = registerDate;
        this.state = state;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cash
     */
    public Integer getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(Integer cash) {
        this.cash = cash;
    }

    /**
     * @return the ctype
     */
    public Integer getCtype() {
        return ctype;
    }

    /**
     * @param ctype the ctype to set
     */
    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the registerDate
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * @return the state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", cash=" + cash + ", ctype=" + ctype + ", cardNo=" + cardNo + ", registerDate=" + registerDate + ", state=" + state + '}';
    }
   
    
}
