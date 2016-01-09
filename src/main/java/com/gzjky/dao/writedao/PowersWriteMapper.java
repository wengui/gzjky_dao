package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Powers;

public interface PowersWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Powers record);

    int insertSelective(Powers record);

    int updateByPrimaryKeySelective(Powers record);

    int updateByPrimaryKey(Powers record);
}