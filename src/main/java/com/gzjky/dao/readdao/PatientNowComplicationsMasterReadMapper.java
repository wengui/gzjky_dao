package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientNowComplicationsMaster;

public interface PatientNowComplicationsMasterReadMapper {

    PatientNowComplicationsMaster selectByPrimaryKey(Integer id);
}