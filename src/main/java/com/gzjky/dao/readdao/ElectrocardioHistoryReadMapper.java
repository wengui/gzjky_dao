package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.ElectrocardioInputBean;
import com.gzjky.bean.extend.ElectrocardioOutputBean;
import com.gzjky.bean.extend.QueryEcgRecordDetailOutputBean;
import com.gzjky.bean.gen.ElectrocardioHistory;

public interface ElectrocardioHistoryReadMapper {

    ElectrocardioHistory selectByPrimaryKey(Integer id);
    
    /**
     * 心电历史信息查询
     * @param record
     * @return
     */
    List<ElectrocardioOutputBean> selectElectrocardioByCondition(ElectrocardioInputBean record);
    
    /**
     * 心电图详细信息
     * @param id
     * @param patientId
     * @return
     */
    QueryEcgRecordDetailOutputBean selectElectrocardioDetail(@Param("id")Integer id, @Param("patientId")Integer patientId);
}