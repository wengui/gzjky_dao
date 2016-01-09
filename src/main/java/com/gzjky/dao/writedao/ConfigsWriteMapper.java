package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Configs;

public interface ConfigsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Configs record);

    int insertSelective(Configs record);

    int updateByPrimaryKeySelective(Configs record);

    int updateByPrimaryKey(Configs record);
}