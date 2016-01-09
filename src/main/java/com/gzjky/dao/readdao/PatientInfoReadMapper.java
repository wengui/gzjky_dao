package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientInfo;

public interface PatientInfoReadMapper {

    PatientInfo selectByPrimaryKey(Integer id);
}