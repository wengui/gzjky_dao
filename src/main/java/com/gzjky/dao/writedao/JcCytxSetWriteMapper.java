package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcCytxSet;

public interface JcCytxSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcCytxSet record);

    int insertSelective(JcCytxSet record);

    int updateByPrimaryKeySelective(JcCytxSet record);

    int updateByPrimaryKey(JcCytxSet record);
}