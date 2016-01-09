package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcXybjSet;

public interface JcXybjSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcXybjSet record);

    int insertSelective(JcXybjSet record);

    int updateByPrimaryKeySelective(JcXybjSet record);

    int updateByPrimaryKey(JcXybjSet record);
}