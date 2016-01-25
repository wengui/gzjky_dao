package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcCytxSet;
import com.gzjky.bean.gen.JcXlbjSet;

public interface JcXlbjSetReadMapper {

    JcXlbjSet selectByPrimaryKey(Integer id);
    
    JcXlbjSet selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}