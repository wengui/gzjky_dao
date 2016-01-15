package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientNowComplicationsChecked;

public interface PatientNowComplicationsCheckedWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientNowComplicationsChecked record);

    int insertSelective(PatientNowComplicationsChecked record);

    int updateByPrimaryKeySelective(PatientNowComplicationsChecked record);

    int updateByPrimaryKey(PatientNowComplicationsChecked record);
}