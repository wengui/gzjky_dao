package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.BloodPressureHistory;

public interface BloodPressureHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BloodPressureHistory record);

    int insertSelective(BloodPressureHistory record);

    int updateByPrimaryKeySelective(BloodPressureHistory record);

    int updateByPrimaryKey(BloodPressureHistory record);
}