package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.UserAndPatient;

public interface UserAndPatientReadMapper {

    UserAndPatient selectByPrimaryKey(Integer id);
}