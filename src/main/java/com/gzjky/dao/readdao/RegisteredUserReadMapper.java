package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.RegisteredUser;

public interface RegisteredUserReadMapper {

    RegisteredUser selectByPrimaryKey(Integer id);
}