package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.UserInfo;

public interface UserInfoWriteMapper {
    int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    int updatePasswordById(@Param("id")Integer id,@Param("password")String password);
    
    int updatePasswordByName(@Param("Name")String Name,@Param("password")String password);
    
}