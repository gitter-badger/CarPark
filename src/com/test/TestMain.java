/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.Idao.ICustomerDao;
import com.Idao.ISpaceDao;
import com.Idao.IUserDao;
import com.dao.CustomerDao;
import com.dao.SpaceDao;
import com.dao.UserDao;
import com.factory.DBManager;
import com.vo.Customer;
import com.vo.Space;
import com.vo.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Zeming
 */
public class TestMain {
            public static void main(String[] args) throws SQLException{
//                IUserDao dao =new UserDao();
//                List list=dao.findUserByCondition(new User("admin",null)); 
//                System.out.println(list);
//                dao.saveUser(new User("admin","admin"));
              //  ICustomerDao dao=new CustomerDao();
                //dao.saveCustomer(new Customer(100,  1, "c0001",Date.valueOf("2012-12-01") , 2));
           //     ISpaceDao dao=new SpaceDao();
          //      dao.saveSpace(new Space("X120", "小型停车场", 0));
//                ISpaceDao dao=new SpaceDao();
//                 List list= dao.findAllSpace();
//                 System.out.println(list);
//         
                Timestamp d =new Timestamp(System.currentTimeMillis());
                System.out.println(d);
            }
}
