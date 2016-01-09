package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorHospitalRole;

public interface DoctorHospitalRoleWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorHospitalRole record);

    int insertSelective(DoctorHospitalRole record);

    int updateByPrimaryKeySelective(DoctorHospitalRole record);

    int updateByPrimaryKey(DoctorHospitalRole record);
}