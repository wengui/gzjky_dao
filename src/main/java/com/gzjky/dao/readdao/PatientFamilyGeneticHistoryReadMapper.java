package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientFamilyGeneticHistory;

public interface PatientFamilyGeneticHistoryReadMapper {

    PatientFamilyGeneticHistory selectByPrimaryKey(Integer id);
}