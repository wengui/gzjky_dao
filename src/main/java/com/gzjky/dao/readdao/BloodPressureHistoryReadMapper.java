package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.QueryBloodPressureOutputBean;
import com.gzjky.bean.gen.BloodPressureHistory;

public interface BloodPressureHistoryReadMapper {

    BloodPressureHistory selectByPrimaryKey(Integer id);
    
    List<QueryBloodPressureOutputBean> selectBloodPressureByCondition(@Param("TestingTime")String TestingTime, @Param("State")String State);
}