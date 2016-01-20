package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.WeeklyReports;

public interface WeeklyReportsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeeklyReports record);

    int insertSelective(WeeklyReports record);

    int updateByPrimaryKeySelective(WeeklyReports record);

    int updateByPrimaryKey(WeeklyReports record);
}