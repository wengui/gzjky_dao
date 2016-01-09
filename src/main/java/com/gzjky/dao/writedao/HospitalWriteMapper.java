package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Hospital;

public interface HospitalWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}