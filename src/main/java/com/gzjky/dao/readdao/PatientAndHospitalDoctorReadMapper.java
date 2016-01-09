package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientAndHospitalDoctor;

public interface PatientAndHospitalDoctorReadMapper {

    PatientAndHospitalDoctor selectByPrimaryKey(Integer id);
}