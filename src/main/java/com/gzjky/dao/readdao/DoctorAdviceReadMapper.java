package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorAdvice;

public interface DoctorAdviceReadMapper {

    DoctorAdvice selectByPrimaryKey(Integer id);
}