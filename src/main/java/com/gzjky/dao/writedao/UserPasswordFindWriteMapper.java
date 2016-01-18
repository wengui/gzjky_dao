package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.UserPasswordFind;

public interface UserPasswordFindWriteMapper {
    int deleteByPrimaryKey(String uid);

    int insert(UserPasswordFind record);

    int insertSelective(UserPasswordFind record);

    int updateByPrimaryKeySelective(UserPasswordFind record);

    int updateByPrimaryKey(UserPasswordFind record);
}