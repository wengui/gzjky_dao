package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.PatientNowComplications;

public interface PatientNowComplicationsReadMapper {
	
    PatientNowComplications selectByPrimaryKey(Integer id);
    
    PatientNowComplications selectByPatientId(@Param("patientId")Integer patientId);
}