/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ibiz;

import com.vo.User;

/**
 *
 * @author Zeming
 */
public interface IUserBiz {
    /**
     * 检查用户是否存在
     * @param user 要检查的用于
     * @return 如果用户存在，返回true ,若不存在则返回false
     */
     public boolean checkUser(User user);
  
     
}
