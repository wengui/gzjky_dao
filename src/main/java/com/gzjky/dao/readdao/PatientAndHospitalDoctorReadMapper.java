package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.PatientAndDoctorHospitalBean;
import com.gzjky.bean.extend.PatientAndEquipmentBean;
import com.gzjky.bean.gen.PatientAndHospitalDoctor;

public interface PatientAndHospitalDoctorReadMapper {

    PatientAndHospitalDoctor selectByPrimaryKey(Integer id);
    
    List<PatientAndDoctorHospitalBean> selectByPatientId(Integer patientId);
}