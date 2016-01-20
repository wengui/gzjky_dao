package com.gzjky.dao.readdao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.MonthlyReports;

public interface MonthlyReportsReadMapper {
	
    MonthlyReports selectByPrimaryKey(@Param("id") Integer id);
}