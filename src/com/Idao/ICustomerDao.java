/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Idao;

import com.vo.Customer;
import java.util.List;

/**
 *客户操作类的接口
 * 用于定义对数据库客户的操作
 * @author Zeming
 */
//添加客户到数据库
public interface ICustomerDao {

    /**
     * 添加客户到数据库
     * @param customer 要添加的客户
     * @return  受影响的行数
     */
    public int saveCustomer(Customer customer);

    /**
     * 根据id查找客户
     * @param id 要查找的客户id
     * @return  查找到的客户
     */
    public Customer findCustomerById(int id);

    /**
     * 随机抽取临时卡
     * @return 返回随机抽到的空闲临时卡
     */
    public Customer findTempCar();
    //查找最大的id

    public int findMaxId();

    /**
     * 修改卡的状态
     * @param customer 要修改的卡
     * @param State  修改后的状态
     */
    public void updateCustomerState(int State, Customer customer);

    /**
     * 根据卡的编号修改卡上余额
     * @param cash 修改后的余额
     * @param customer  要修改的客户
     */
    public void updateCustomerCash(int cash, Customer customer);

    /**
     * 通过卡号的信息验证卡号
     * @param customer 要验证的卡号
     * @return  返回查找到的列表
     */
    public List findCustomerByCondition(Customer customer);

    /**
     * 根据卡的状态查找卡号列表
     * @param state 卡的状态 
     * @param ctype 卡的类型 
     * @return 查找到的列表
     */
    public List findCustomerByState(int state, int ctype);
    /**
     * 查找所有的客户
     * @return  所有的客户
     */
    public List<Customer> findAllCustomer();
}
