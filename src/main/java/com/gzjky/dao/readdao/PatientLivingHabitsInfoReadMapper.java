package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientLivingHabitsInfo;

public interface PatientLivingHabitsInfoReadMapper {
	
    PatientLivingHabitsInfo selectByPrimaryKey(Integer id);
}