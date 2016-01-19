package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.QueryBloodPressureInputBean;
import com.gzjky.bean.extend.QueryBloodPressureOutputBean;
import com.gzjky.bean.gen.BloodPressureHistory;
import com.gzjky.bean.extend.QueryBPandHROutputBean;

public interface BloodPressureHistoryReadMapper {

    BloodPressureHistory selectByPrimaryKey(Integer id);
    
    List<QueryBloodPressureOutputBean> selectBloodPressureByCondition(QueryBloodPressureInputBean record);
    
    QueryBPandHROutputBean  selectBPandHRresult(Integer id);
}