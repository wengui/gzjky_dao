package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.UserAndPatient;
import java.util.List;
public interface UserAndPatientReadMapper {

    UserAndPatient selectByPrimaryKey(Integer id);
       
    List<UserAndPatient> selectByUserId(Integer id);
}