package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.BiochemicalHistory;

public interface BiochemicalHistoryReadMapper {
	
    BiochemicalHistory selectByPrimaryKey(Integer id);
}