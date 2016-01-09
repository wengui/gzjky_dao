package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.BloodPressureHistory;

public interface BloodPressureHistoryReadMapper {

    BloodPressureHistory selectByPrimaryKey(Integer id);
}