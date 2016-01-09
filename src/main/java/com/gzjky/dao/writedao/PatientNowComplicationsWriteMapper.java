package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientNowComplications;

public interface PatientNowComplicationsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientNowComplications record);

    int insertSelective(PatientNowComplications record);

    int updateByPrimaryKeySelective(PatientNowComplications record);

    int updateByPrimaryKey(PatientNowComplications record);
}