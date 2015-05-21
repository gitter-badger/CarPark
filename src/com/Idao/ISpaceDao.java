/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Idao;

import com.vo.Space;
import java.util.List;

/**
 *停车场操作类的接口
 * 用于定义对数据库的操作
 * @author Zeming
 */
public interface ISpaceDao {
    //添加停车场到数据库
    public int saveSpace(Space space);
 
  
    //查找所有停车场
    public List<Space>findAllSpace();
    //根据状态查询停车场
    public List <Space>findSpaceByCondition(int state);
    /**
     * 修改场地的状态
     * @param space  要修改的场地
     * @param State  修改后的状态
     */
    public void updateSpaceState(Space space,int State);
}
