/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Idao.IUserDao;
import com.vo.User;
import java.util.List;

/**
 *
 * @author Zeming
 */
public class UserDao extends BasicDao<User> implements IUserDao{

    public int saveUser(User user) {
       String sql=" insert into user(username,userpwd) value(?,?)  ";
       int row =executeUpdatePerparement(sql, user.getUserName(),user.getUserPwd());
       return row ;
    }

    public User findUserByName(String userName) {
        String sql=" select * from user where userName=? ";
        User user=findByPredStatmentT(sql, userName);
        return user;
    }

    public List findUserByCondition(User user) {
        String sql=" select * from user where  ";
        return  super.findListTByCondition(sql, user);
    }
    
}
