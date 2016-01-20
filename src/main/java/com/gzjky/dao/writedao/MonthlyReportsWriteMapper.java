package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MonthlyReports;

public interface MonthlyReportsWriteMapper {
    int insert(MonthlyReports record);

    int insertSelective(MonthlyReports record);
}