package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.RegisteredUser;

public interface RegisteredUserWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisteredUser record);

    int insertSelective(RegisteredUser record);

    int updateByPrimaryKeySelective(RegisteredUser record);

    int updateByPrimaryKey(RegisteredUser record);
}