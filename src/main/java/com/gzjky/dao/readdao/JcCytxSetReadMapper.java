package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcBdhmSet;
import com.gzjky.bean.gen.JcCytxSet;

public interface JcCytxSetReadMapper {

    JcCytxSet selectByPrimaryKey(Integer id);
    List<JcCytxSet> selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}