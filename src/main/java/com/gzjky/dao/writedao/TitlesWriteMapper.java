package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Titles;

public interface TitlesWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Titles record);

    int insertSelective(Titles record);

    int updateByPrimaryKeySelective(Titles record);

    int updateByPrimaryKey(Titles record);
}