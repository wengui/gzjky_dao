package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientAndHospitalDoctor;

public interface PatientAndHospitalDoctorWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientAndHospitalDoctor record);

    int insertSelective(PatientAndHospitalDoctor record);

    int updateByPrimaryKeySelective(PatientAndHospitalDoctor record);

    int updateByPrimaryKey(PatientAndHospitalDoctor record);
}