package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorHospital;

public interface DoctorHospitalWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorHospital record);

    int insertSelective(DoctorHospital record);

    int updateByPrimaryKeySelective(DoctorHospital record);

    int updateByPrimaryKey(DoctorHospital record);
}