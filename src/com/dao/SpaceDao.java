/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Idao.ISpaceDao;
import com.vo.Space;
import java.util.List;

/**
 *
 * @author Zeming
 */
public class SpaceDao extends BasicDao<Space> implements ISpaceDao {

    public int saveSpace(Space space) {
       String sql=" insert into space(cname,cdesc,state) value(?,?,?)  ";
       int row =executeUpdatePerparement(sql, space.getCname(),space.getCdesc(),space.getState());
       return row;
    }
    public List<Space> findAllSpace() {
         String sql=" select * from space ";
         return super.findListT(sql);
    }
    public List<Space> findSpaceByCondition(int state) {
        String sql=" select * from space where state=? ";
         return super.findListT(sql,state);
    }
    public void updateSpaceState(Space space, int State) {
         String sql=" update space set state= ? where id= ? ";
       super.executeUpdatePerparement(sql, State ,space.getId());
    }
    
}
