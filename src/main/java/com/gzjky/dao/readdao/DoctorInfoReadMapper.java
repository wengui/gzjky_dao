package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorInfo;

public interface DoctorInfoReadMapper {
	
    DoctorInfo selectByPrimaryKey(Integer id);
}