package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.gen.PatientNowComplicationsMaster;

public interface PatientNowComplicationsMasterReadMapper {

    PatientNowComplicationsMaster selectByPrimaryKey(Integer id);
    
    List<PatientNowComplicationsMaster> selectAllRecord();
}