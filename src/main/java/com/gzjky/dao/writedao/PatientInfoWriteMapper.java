package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientInfo;

public interface PatientInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientInfo record);

    int insertSelective(PatientInfo record);

    int updateByPrimaryKeySelective(PatientInfo record);

    int updateByPrimaryKeyWithBLOBs(PatientInfo record);

    int updateByPrimaryKey(PatientInfo record);
}