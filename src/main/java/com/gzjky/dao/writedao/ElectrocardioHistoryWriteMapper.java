package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.ElectrocardioHistory;

public interface ElectrocardioHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ElectrocardioHistory record);

    int insertSelective(ElectrocardioHistory record);

    int updateByPrimaryKeySelective(ElectrocardioHistory record);

    int updateByPrimaryKey(ElectrocardioHistory record);
}