package com.gzjky.dao.readdao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.PatientFamilyGeneticHistoryDetail;

public interface PatientFamilyGeneticHistoryDetailReadMapper {

    PatientFamilyGeneticHistoryDetail selectByPrimaryKey(Integer id);
    
    /**
     * 
     * @param patientId
     * @return
     */
    List<PatientFamilyGeneticHistoryDetail> selectByPatientId(@Param("patientId")Integer patientId);
}