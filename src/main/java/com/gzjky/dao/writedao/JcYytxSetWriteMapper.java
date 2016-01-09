package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcYytxSet;

public interface JcYytxSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcYytxSet record);

    int insertSelective(JcYytxSet record);

    int updateByPrimaryKeySelective(JcYytxSet record);

    int updateByPrimaryKey(JcYytxSet record);
}