package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.gen.UserAndPatient;
import com.gzjky.bean.gen.UserPasswordFind;

public interface UserPasswordFindReadMapper {


    UserPasswordFind selectByPrimaryKey(String uid);

    List<UserPasswordFind> selectByUserID(Integer UserId);
}