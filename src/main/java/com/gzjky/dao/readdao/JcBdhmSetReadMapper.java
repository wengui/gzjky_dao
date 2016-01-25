package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcBdhmSet;

public interface JcBdhmSetReadMapper {

    JcBdhmSet selectByPrimaryKey(Integer id);
    
    JcBdhmSet selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}