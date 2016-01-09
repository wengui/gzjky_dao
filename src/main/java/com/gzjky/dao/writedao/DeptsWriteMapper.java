package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Depts;

public interface DeptsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Depts record);

    int insertSelective(Depts record);

    int updateByPrimaryKeySelective(Depts record);

    int updateByPrimaryKey(Depts record);
}