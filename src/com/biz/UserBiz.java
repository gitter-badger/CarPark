/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.Ibiz.IUserBiz;
import com.Idao.IUserDao;
import com.carpark.view.MainJFrame;
import com.dao.UserDao;
import com.vo.User;
import java.util.List;

/**
 *用户业务层
 * @author Zeming
 */
public class UserBiz implements IUserBiz{
    public static User user;//设置静态变量，添加记录时调用
    //检查登录用户
    public boolean checkUser(User checkUser)  {
        IUserDao dao = new UserDao();
       List UserList=  dao.findUserByCondition(checkUser);
        if (UserList!=null&&UserList.size()>0) {
            user=(User) UserList.get(0);
            return true;
        } else {
            return false;
        }
    }
}
