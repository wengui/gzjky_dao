package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcBdhmSet;
import com.gzjky.bean.gen.JcDsscSet;

public interface JcDsscSetReadMapper {

    JcDsscSet selectByPrimaryKey(Integer id);
    JcDsscSet selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}