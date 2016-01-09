package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorAdviceHistory;

public interface DoctorAdviceHistoryReadMapper {
	
    DoctorAdviceHistory selectByPrimaryKey(Integer id);
}