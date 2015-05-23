/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.Ibiz.ICustomerBiz;
import com.Idao.ICustomerDao;
import com.dao.CustomerDao;
import com.vo.Customer;
import java.util.List;

/**
 *客户类的业务处理层
 * @author Zeming
 */
public class CustomerBiz implements ICustomerBiz {
    public boolean checkCustomer(Customer customer) {
        ICustomerDao dao = new CustomerDao();
        List CustomerList = dao.findCustomerByCondition(customer);
        if (CustomerList != null && CustomerList.size() > 0) {
            // customer=(Customer) CustomerList.get(0);
            return true;
        } else {
            return false;
        }
    }
}