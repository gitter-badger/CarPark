/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;

/**
 *停车场场地类
 * @author Zeming
 */
public class Space implements Serializable{

    private Integer id;
    private String cname;//场地的名称
    private String cdesc;//场地的描述
    private Integer state;//场地的状态 ,1在用 ,0,空闲, 2维修',

    public Space() {
    }

    
        public Space(String cname, String cdesc, Integer state) {
        this.cname = cname;
        this.cdesc = cdesc;
        this.state = state;
    }
    
    public Space(Integer id, String cname, String cdesc, Integer state) {
        this.id = id;
        this.cname = cname;
        this.cdesc = cdesc;
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
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the cdesc
     */
    public String getCdesc() {
        return cdesc;
    }

    /**
     * @param cdesc the cdesc to set
     */
    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
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
        return "Space{" + "id=" + id + ", cname=" + cname + ", cdesc=" + cdesc + ", state=" + state + '}';
    }
}
