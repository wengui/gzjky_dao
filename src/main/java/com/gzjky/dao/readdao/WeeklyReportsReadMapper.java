package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.WeeklyReports;

public interface WeeklyReportsReadMapper {

    WeeklyReports selectByPrimaryKey(Integer id);
}