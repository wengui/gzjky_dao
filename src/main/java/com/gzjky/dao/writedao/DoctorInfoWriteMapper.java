package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorInfo;

public interface DoctorInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}