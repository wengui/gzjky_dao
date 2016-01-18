package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.PatientFamilyGeneticHistory;

public interface PatientFamilyGeneticHistoryReadMapper {

    PatientFamilyGeneticHistory selectByPrimaryKey(Integer id);
    
    PatientFamilyGeneticHistory selectByPatientId(@Param("patientId")Integer patientId);
}