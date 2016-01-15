package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.PatientNowComplicationsChecked;

public interface PatientNowComplicationsCheckedReadMapper {

    PatientNowComplicationsChecked selectByPrimaryKey(Integer id);
    
    List<PatientNowComplicationsChecked> selectByPatientId(@Param("patientId")Integer patientId);
}