package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Hospital;

public interface HospitalReadMapper {

    Hospital selectByPrimaryKey(Integer id);
}