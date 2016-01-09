package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.BiochemicalHistory;

public interface BiochemicalHistoryWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BiochemicalHistory record);

    int insertSelective(BiochemicalHistory record);

    int updateByPrimaryKeySelective(BiochemicalHistory record);

    int updateByPrimaryKey(BiochemicalHistory record);
}