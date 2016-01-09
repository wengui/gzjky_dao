package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.RegisteredUserCheck;

public interface RegisteredUserCheckReadMapper {

    RegisteredUserCheck selectByPrimaryKey(Integer id);
}