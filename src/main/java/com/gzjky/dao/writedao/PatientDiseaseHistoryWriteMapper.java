package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientDiseaseHistory;

public interface PatientDiseaseHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientDiseaseHistory record);

    int insertSelective(PatientDiseaseHistory record);

    int updateByPrimaryKeySelective(PatientDiseaseHistory record);

    int updateByPrimaryKeyWithBLOBs(PatientDiseaseHistory record);

    int updateByPrimaryKey(PatientDiseaseHistory record);
}