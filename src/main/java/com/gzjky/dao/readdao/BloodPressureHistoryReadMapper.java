package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.QueryBPandHROutputBean;
import com.gzjky.bean.extend.QueryBloodPressureApiOutputBean;
import com.gzjky.bean.extend.QueryBloodPressureInputBean;
import com.gzjky.bean.extend.QueryBloodPressureOutputBean;
import com.gzjky.bean.gen.BloodPressureHistory;

public interface BloodPressureHistoryReadMapper {

    BloodPressureHistory selectByPrimaryKey(Integer id);
    
    List<QueryBloodPressureOutputBean> selectBloodPressureByCondition(QueryBloodPressureInputBean record);
    
    QueryBPandHROutputBean selectBPandHRresult(Integer id);
    
    List<QueryBloodPressureOutputBean> selectBloodPressureGraft(@Param("id")Integer id, @Param("bpType")String bpType);
    
    /**
     * Api 血压折线图数据取得
     * @param id
     * @param bpType
     * @return
     */
    List<QueryBloodPressureApiOutputBean> selectBloodApiPressureGraft(@Param("id")Integer id, @Param("bpType")String bpType);

}