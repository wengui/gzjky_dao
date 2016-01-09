package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientWorkInfo;

public interface PatientWorkInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientWorkInfo record);

    int insertSelective(PatientWorkInfo record);

    int updateByPrimaryKeySelective(PatientWorkInfo record);

    int updateByPrimaryKey(PatientWorkInfo record);
}