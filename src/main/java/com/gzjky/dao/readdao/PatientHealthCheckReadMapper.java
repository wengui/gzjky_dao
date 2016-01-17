package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.PatientHealthCheckInputBean;
import com.gzjky.bean.extend.PatientHealthCheckOutputBean;
import com.gzjky.bean.gen.PatientHealthCheck;

public interface PatientHealthCheckReadMapper {

    PatientHealthCheck selectByPrimaryKey(Integer id);
    
    List<PatientHealthCheckOutputBean> selectByPatientId(PatientHealthCheckInputBean record);
}