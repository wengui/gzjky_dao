package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.ElectrocardioInputBean;
import com.gzjky.bean.extend.ElectrocardioOutputBean;
import com.gzjky.bean.gen.ElectrocardioHistory;

public interface ElectrocardioHistoryReadMapper {

    ElectrocardioHistory selectByPrimaryKey(Integer id);
    
    /**
     * 心电历史信息查询
     * @param record
     * @return
     */
    List<ElectrocardioOutputBean> selectElectrocardioByCondition(ElectrocardioInputBean record);
}