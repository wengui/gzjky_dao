package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DictionaryInfo;

public interface DictionaryInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryInfo record);

    int insertSelective(DictionaryInfo record);

    int updateByPrimaryKeySelective(DictionaryInfo record);

    int updateByPrimaryKey(DictionaryInfo record);
}