package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.ElectrocardioHistory;

public interface ElectrocardioHistoryReadMapper {

    ElectrocardioHistory selectByPrimaryKey(Integer id);
}