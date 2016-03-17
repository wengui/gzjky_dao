package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.UserAndPhone;

public interface UserAndPhoneWriteMapper {

	
    int insert(UserAndPhone record);

    int insertSelective(UserAndPhone record);
}