package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcXlbjSet;

public interface JcXlbjSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcXlbjSet record);

    int insertSelective(JcXlbjSet record);

    int updateByPrimaryKeySelective(JcXlbjSet record);

    int updateByPrimaryKey(JcXlbjSet record);
}