/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *消费记录类
 * @author Zeming
 */
public class Record implements Serializable{

    private Integer id;
    private Integer uid;//用户id
    private Integer pid;//场地id
    private Integer cid;//客户表id
    private Timestamp stime;//开始时间
    private Timestamp etime;//结束时间
    private Integer pay;//支付费用

    public Record() {
    }

    public Record(Integer id, Integer uid, Integer pid, Integer cid, Timestamp stime, Timestamp etime, Integer pay) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
        this.cid = cid;
        this.stime = stime;
        this.etime = etime;
        this.pay = pay;
    }
    
      public Record(Integer uid, Integer pid, Integer cid, Timestamp stime, Timestamp etime, Integer pay) {
        this.uid = uid;
        this.pid = pid;
        this.cid = cid;
        this.stime = stime;
        this.etime = etime;
        this.pay = pay;
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
     * @return the uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return the pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return the cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return the stime
     */
    public Timestamp getStime() {
        return stime;
    }

    /**
     * @param stime the stime to set
     */
    public void setStime(Timestamp stime) {
        this.stime = stime;
    }

    /**
     * @return the etime
     */
    public Timestamp getEtime() {
        return etime;
    }

    /**
     * @param etime the etime to set
     */
    public void setEtime(Timestamp etime) {
        this.etime = etime;
    }

    /**
     * @return the pay
     */
    public Integer getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(Integer pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", uid=" + uid + ", pid=" + pid + ", cid=" + cid + ", stime=" + stime + ", etime=" + etime + ", pay=" + pay + '}';
    }
}
