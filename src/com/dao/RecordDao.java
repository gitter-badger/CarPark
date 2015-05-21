/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Idao.IRecordDao;
import com.vo.Record;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Zeming
 */
public class RecordDao extends BasicDao<Record> implements IRecordDao{

    public int saveRecordS(Record record) {
       String sql=" insert into record(uid,pid,cid,stime) value(?,?,?,?)  ";     
       int row =executeUpdatePerparement(sql, record.getUid(),record.getPid(),record.getCid(),record.getStime() );
       return row;
    }

    public Record findRecordBySpaceId(int spaceId) {
      String sql=" select * from record where pid=? and etime is null; ";
      return findByPredStatmentT(sql, spaceId);
    }

    public void updateRecordE(int pid, Timestamp etime, int pay) {
        String sql=" update record set etime= ? , pay= ? where cid= ? ";
        super.executeUpdatePerparement(sql, etime,pay,pid);
    }

    public List<Record> findAllRecord() {
        String sql=" select * from record ";
        return super.findListT(sql);
    }
}
