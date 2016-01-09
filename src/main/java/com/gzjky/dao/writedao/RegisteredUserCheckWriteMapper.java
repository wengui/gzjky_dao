package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.RegisteredUserCheck;

public interface RegisteredUserCheckWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisteredUserCheck record);

    int insertSelective(RegisteredUserCheck record);

    int updateByPrimaryKeySelective(RegisteredUserCheck record);

    int updateByPrimaryKey(RegisteredUserCheck record);
}