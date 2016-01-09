package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorsReport;

public interface DoctorsReportWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorsReport record);

    int insertSelective(DoctorsReport record);

    int updateByPrimaryKeySelective(DoctorsReport record);

    int updateByPrimaryKey(DoctorsReport record);
}