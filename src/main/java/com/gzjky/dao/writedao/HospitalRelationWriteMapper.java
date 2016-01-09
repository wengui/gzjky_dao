package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.HospitalRelation;

public interface HospitalRelationWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalRelation record);

    int insertSelective(HospitalRelation record);

    int updateByPrimaryKeySelective(HospitalRelation record);

    int updateByPrimaryKey(HospitalRelation record);
}