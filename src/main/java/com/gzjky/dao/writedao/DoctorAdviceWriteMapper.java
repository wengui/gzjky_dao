package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorAdvice;

public interface DoctorAdviceWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorAdvice record);

    int insertSelective(DoctorAdvice record);

    int updateByPrimaryKeySelective(DoctorAdvice record);

    int updateByPrimaryKey(DoctorAdvice record);
}