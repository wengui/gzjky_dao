package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientFamilyGeneticHistoryDetail;

public interface PatientFamilyGeneticHistoryDetailWriteMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByPatientId(Integer patientId);

    int insert(PatientFamilyGeneticHistoryDetail record);

    int insertSelective(PatientFamilyGeneticHistoryDetail record);

    int updateByPrimaryKeySelective(PatientFamilyGeneticHistoryDetail record);

    int updateByPrimaryKey(PatientFamilyGeneticHistoryDetail record);
}