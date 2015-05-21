/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.Ibiz.ISpaceBiz;
import com.Idao.ISpaceDao;
import com.carpark.view.MainJFrame;
import com.dao.SpaceDao;
import java.util.List;

/**
 *场地类的业务处理
 * @author Zeming
 */
public class SpaceBiz implements ISpaceBiz{
    private ISpaceDao spaceDao;
    private List spaceList;
    //刷新主界面方法
       public void refresh(){
           spaceDao=new SpaceDao();
           spaceList=  spaceDao.findAllSpace();
            //获取单例，刷新界面
            MainJFrame.getInstrance().showJPanel(spaceList);
       }
}
