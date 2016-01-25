package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcYytxSet;

public interface JcYytxSetReadMapper {

    JcYytxSet selectByPrimaryKey(Integer id);
    List<JcYytxSet> selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}