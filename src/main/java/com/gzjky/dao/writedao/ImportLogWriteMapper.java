package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.ImportLog;

public interface ImportLogWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImportLog record);

    int insertSelective(ImportLog record);

    int updateByPrimaryKeySelective(ImportLog record);

    int updateByPrimaryKeyWithBLOBs(ImportLog record);

    int updateByPrimaryKey(ImportLog record);
}