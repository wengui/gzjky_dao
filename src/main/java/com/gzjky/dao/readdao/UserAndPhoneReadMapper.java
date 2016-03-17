package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.UserAndPhone;

public interface UserAndPhoneReadMapper {
	
	UserAndPhone selectByPrimaryKey(String username);
	

}