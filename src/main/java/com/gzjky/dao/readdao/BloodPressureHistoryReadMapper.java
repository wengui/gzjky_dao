package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.QueryBloodPressureInputBean;
import com.gzjky.bean.extend.QueryBloodPressureOutputBean;
import com.gzjky.bean.gen.BloodPressureHistory;

public interface BloodPressureHistoryReadMapper {

    BloodPressureHistory selectByPrimaryKey(Integer id);
    
    List<QueryBloodPressureOutputBean> selectBloodPressureByCondition(QueryBloodPressureInputBean record);
}