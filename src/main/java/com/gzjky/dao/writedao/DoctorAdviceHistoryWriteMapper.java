package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorAdviceHistory;

public interface DoctorAdviceHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorAdviceHistory record);

    int insertSelective(DoctorAdviceHistory record);

    int updateByPrimaryKeySelective(DoctorAdviceHistory record);

    int updateByPrimaryKey(DoctorAdviceHistory record);
}