package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.UserInfo;

public interface UserInfoReadMapper {
	
    UserInfo selectByPrimaryKey(@Param("id")Integer id);
    
    /**
     * 
     * @param name 用户名
     * @param cellphone 手机号码
     * @param Email 邮箱
     * @return UserInfo
     */
    UserInfo selectBy(@Param("name")String name, @Param("cellphone")String cellphone, @Param("email")String email);
    /**
     * 
     * @param name 用户名
     * @return 返回数据库条数
     */
    Integer selectByUserName(@Param("name")String name);
    
    /**
     * 
     * @param name 用户名
     * @return 返回数据库条数
     */
    UserInfo selectUserByUserName(@Param("name")String name);
    /**
     * 
     * @param cellphone 手机号码
     * @return 返回数据库条数
     */
    
    Integer selectByCellPhone(@Param("cellphone")String cellphone);
    /**
     * 
     * @param Email 邮箱
     * @return 返回数据库条数
     */
    Integer selectByEmail(@Param("email")String email);
}