package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Consultation;

public interface ConsultationReadMapper {
	
    Consultation selectByPrimaryKey(Integer id);
}