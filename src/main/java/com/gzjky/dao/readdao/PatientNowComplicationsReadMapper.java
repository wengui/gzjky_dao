package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientNowComplications;

public interface PatientNowComplicationsReadMapper {
	
    PatientNowComplications selectByPrimaryKey(Integer id);
}