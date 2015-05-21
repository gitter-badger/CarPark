/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Idao;

import com.vo.User;
import java.util.List;

/**
*用户操作类的接口
 * 用于定义对数据库用户的操作
 * @author Zeming
 */
public interface IUserDao {
    //添加用户到数据库
    public int saveUser(User user);
    //删除用户
    public User findUserByName(String userName);
    //根据信息查找用户
    public List findUserByCondition(User user);
}
