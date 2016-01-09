package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientHealthCheck;

public interface PatientHealthCheckReadMapper {

    PatientHealthCheck selectByPrimaryKey(Integer id);
}