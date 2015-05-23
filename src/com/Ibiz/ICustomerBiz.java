/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ibiz;

import com.vo.Customer;

/**
 *客户业务层接口
 * 定义业务的操作
 * @author Zeming
 */
public interface ICustomerBiz {
    /**
     * 检查是否存在此客户
     * @param customer 要检查的客户
     * @return 如果有则返回true 没有则返回false
     */
     public boolean checkCustomer(Customer customer);
}
