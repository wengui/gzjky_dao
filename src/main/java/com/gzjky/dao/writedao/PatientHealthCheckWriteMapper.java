package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientHealthCheck;

public interface PatientHealthCheckWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientHealthCheck record);

    int insertSelective(PatientHealthCheck record);

    int updateByPrimaryKeySelective(PatientHealthCheck record);

    int updateByPrimaryKey(PatientHealthCheck record);
}