package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.RolePowers;
import org.apache.ibatis.annotations.Param;

public interface RolePowersReadMapper {

	RolePowers selectByPrimaryKey(@Param("roleid") Integer roleid);
}