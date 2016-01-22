package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PJcXybjSet;

public interface PJcXybjSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PJcXybjSet record);

    int insertSelective(PJcXybjSet record);



    int updateByPrimaryKeySelective(PJcXybjSet record);

    int updateByPrimaryKey(PJcXybjSet record);
}