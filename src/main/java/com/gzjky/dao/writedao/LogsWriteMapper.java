package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Logs;

public interface LogsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logs record);

    int insertSelective(Logs record);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKey(Logs record);
}