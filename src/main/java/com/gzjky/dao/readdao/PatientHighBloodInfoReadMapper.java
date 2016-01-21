package com.gzjky.dao.readdao;


import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.QueryMemberHtSpecialOutputBean;
import com.gzjky.bean.gen.PatientHighBloodInfo;

public interface PatientHighBloodInfoReadMapper {

    PatientHighBloodInfo selectByPrimaryKey(Integer id);
    
    PatientHighBloodInfo selectByPatientid(@Param("patientId")Integer patientId);
    
    QueryMemberHtSpecialOutputBean selectRecordByPatientid(@Param("patientId")Integer patientId);
}