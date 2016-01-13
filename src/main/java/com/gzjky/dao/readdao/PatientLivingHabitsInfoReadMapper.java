package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.extend.PatientLivingHabitsOutputBean;
import com.gzjky.bean.gen.PatientLivingHabitsInfo;

public interface PatientLivingHabitsInfoReadMapper {
	
    PatientLivingHabitsInfo selectByPrimaryKey(Integer id);
    
    /**
     * 通过患者ID查询生活习惯
     * @param patientId
     * @return
     */
    PatientLivingHabitsOutputBean selectByPatientId(@Param("patientId")Integer patientId);
}