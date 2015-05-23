/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Idao.ICustomerDao;
import com.factory.DBManager;
import com.vo.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zeming
 */
public class CustomerDao extends BasicDao<Customer> implements ICustomerDao {

    public int saveCustomer(Customer c) {
        String sql = " insert into customer(cash,ctype,cardNo,registerDate,state) value(?,?,?,?,?)  ";
        int row = executeUpdatePerparement(sql, c.getCash(), c.getCtype(), c.getCardNo(), c.getRegisterDate(), c.getState());
        return row;
    }

    public Customer findCustomerById(int id) {
        String sql = " select * from customer where id=? ";
        return findByPredStatmentT(sql, id);
    }

    public Customer findTempCar() {
        String sql = " select * from customer where ctype=0 and state=0 ";
        List<Customer> tempList = super.findListT(sql);
        Customer customer = null;
        if (tempList != null && tempList.size() > 1) {
            //随机获取卡号
            Random random = new Random();
            int num = random.nextInt(tempList.size());
            customer = tempList.get(num);
        } else if (tempList != null && tempList.size() == 1) {
            customer = tempList.get(0);
        }
        return customer;
    }

    public int findMaxId() {
        int maxId = 0;
        try {
            //查找最大的id
            String sql = " select max(id) from customer ";
            ResultSet rs = super.select(sql);
            while (rs.next()) {
                maxId = rs.getInt("max(id)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.close(conn, pstm, rs);
        return maxId;
    }

    public void updateCustomerState(int State, Customer customer) {
        String sql = " update customer set state= ?  where id= ?   ";
        super.executeUpdatePerparement(sql, State, customer.getId());
    }

    public void updateCustomerCash(int cash, Customer customer) {
        String sql = " update customer set cash= ?  where id= ?   ";
        super.executeUpdatePerparement(sql, cash, customer.getId());
    }

    public List findCustomerByCondition(Customer customer) {
        String sql = " select * from customer where ";
        return super.findListTByCondition(sql, customer);
    }

    public List findCustomerByState(int state, int ctype) {
        String sql = " select * from customer where state= ? and ctype=? ";
        return super.findListT(sql, state, ctype);
    }

    public List<Customer> findAllCustomer() {
        String sql=" select * from customer ";
        return super.findListT(sql);
    }
}
