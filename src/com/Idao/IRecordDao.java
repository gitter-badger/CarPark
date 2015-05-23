/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Idao;

import com.vo.Record;
import java.sql.Timestamp;
import java.util.List;

/**
 *记录操作类的接口
 * 用于定义对数据库记录的操作
 * @author Zeming
 */
public interface IRecordDao {
    /**
     * 添加开始记录到数据库
     * @param record 要添加的记录
     * @return  影响的行数
     */
    public int saveRecordS(Record record);
  
  /**
     * 根据场地编号查找记录
     * @param spaceId 场地编号
     * @return 找到的记录
     */
    public Record findRecordBySpaceId(int spaceId);
    /**
     * 根据卡编号来更新卡的消费记录
     * @param cid 卡的编号
     * @param etime 停车结束时间
     * @param pay  消费金额
     */
    public void updateRecordE(int cid, Timestamp etime,int pay);
    /**
     * 查找所有的消费记录
     * @return 所有的消费记录
     */
    public List<Record>findAllRecord();
}
