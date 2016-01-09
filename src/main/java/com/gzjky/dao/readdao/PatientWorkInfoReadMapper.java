package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientWorkInfo;

public interface PatientWorkInfoReadMapper {

    PatientWorkInfo selectByPrimaryKey(Integer id);
}