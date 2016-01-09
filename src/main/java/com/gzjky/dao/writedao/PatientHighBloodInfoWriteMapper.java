package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientHighBloodInfo;

public interface PatientHighBloodInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientHighBloodInfo record);

    int insertSelective(PatientHighBloodInfo record);

    int updateByPrimaryKeySelective(PatientHighBloodInfo record);

    int updateByPrimaryKeyWithBLOBs(PatientHighBloodInfo record);

    int updateByPrimaryKey(PatientHighBloodInfo record);
}