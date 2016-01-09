package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.ConsultationResult;

public interface ConsultationResultReadMapper {

    ConsultationResult selectByPrimaryKey(Integer id);
}