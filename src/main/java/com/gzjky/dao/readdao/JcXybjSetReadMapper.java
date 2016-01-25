package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcXlbjSet;
import com.gzjky.bean.gen.JcXybjSet;

public interface JcXybjSetReadMapper {

    JcXybjSet selectByPrimaryKey(Integer id);
    JcXybjSet selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}