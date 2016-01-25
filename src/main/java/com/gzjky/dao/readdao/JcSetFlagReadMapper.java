package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcSetFlag;
import com.gzjky.bean.gen.JcXlbjSet;

public interface JcSetFlagReadMapper {
	JcSetFlag selectByDeviceIdAndPatientId(@Param("eid")Integer eid ,@Param("uid")String uid);
}