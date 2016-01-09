package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientDiseaseHistory;

public interface PatientDiseaseHistoryReadMapper {

    PatientDiseaseHistory selectByPrimaryKey(Integer id);
}