package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.HospitalRelation;

public interface HospitalRelationReadMapper {

    HospitalRelation selectByPrimaryKey(Integer id);
}