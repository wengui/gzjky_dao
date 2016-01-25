package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcDsscSet;
import com.gzjky.bean.gen.JcXlbjSet;

public interface JcDsscSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcDsscSet record);

    int insertSelective(JcDsscSet record);

    int updateByPrimaryKeySelective(JcDsscSet record);

    int updateByPrimaryKey(JcDsscSet record);
    int updateByEidAndPid(JcDsscSet record);
}