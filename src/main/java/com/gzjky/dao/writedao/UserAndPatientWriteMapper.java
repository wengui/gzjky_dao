package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.UserAndPatient;

public interface UserAndPatientWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAndPatient record);

    int insertSelective(UserAndPatient record);

    int updateByPrimaryKeySelective(UserAndPatient record);

    int updateByPrimaryKey(UserAndPatient record);
}