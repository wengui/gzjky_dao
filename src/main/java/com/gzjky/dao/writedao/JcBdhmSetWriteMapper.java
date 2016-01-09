package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcBdhmSet;

public interface JcBdhmSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcBdhmSet record);

    int insertSelective(JcBdhmSet record);

    int updateByPrimaryKeySelective(JcBdhmSet record);

    int updateByPrimaryKey(JcBdhmSet record);
}