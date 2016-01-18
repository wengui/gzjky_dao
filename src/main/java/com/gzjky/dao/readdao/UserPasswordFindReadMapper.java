package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.UserPasswordFind;

public interface UserPasswordFindReadMapper {


    UserPasswordFind selectByPrimaryKey(String uid);


}