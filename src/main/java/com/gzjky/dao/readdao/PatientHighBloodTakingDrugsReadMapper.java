package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.TakeDrugsBean;
import com.gzjky.bean.gen.PatientHighBloodTakingDrugs;

public interface PatientHighBloodTakingDrugsReadMapper {

    PatientHighBloodTakingDrugs selectByPrimaryKey(Integer id);
    
    List<TakeDrugsBean> selectByHighbloodinfoId(@Param("bloodInfoId")Integer bloodInfoId);
}