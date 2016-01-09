package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientFamilyGeneticHistory;

public interface PatientFamilyGeneticHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientFamilyGeneticHistory record);

    int insertSelective(PatientFamilyGeneticHistory record);

    int updateByPrimaryKeySelective(PatientFamilyGeneticHistory record);

    int updateByPrimaryKey(PatientFamilyGeneticHistory record);
}