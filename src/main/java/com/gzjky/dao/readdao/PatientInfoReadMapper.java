package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.PatientInfoOutputBean;
import com.gzjky.bean.gen.PatientInfo;

public interface PatientInfoReadMapper {

    PatientInfo selectByPrimaryKey(Integer id);
    
    /**
     * 查询患者基本信息
     * @param id
     * @return
     */
    PatientInfoOutputBean selectByPatientId(@Param("id")Integer id);
}