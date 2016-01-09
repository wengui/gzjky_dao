package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcDsscSet;

public interface JcDsscSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcDsscSet record);

    int insertSelective(JcDsscSet record);

    int updateByPrimaryKeySelective(JcDsscSet record);

    int updateByPrimaryKey(JcDsscSet record);
}