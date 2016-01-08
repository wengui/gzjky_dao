package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.UserInfo;

public interface UserInfoReadMapper {
	
    UserInfo selectByPrimaryKey(@Param("id")Integer id);
    
    /**
     * 
     * @param loginId 用户名
     * @param password 密码
     * @return 登录
     */
    UserInfo selectByUserName(@Param("name")String name, @Param("cellphone")String cellphone, @Param("password")String password);

}