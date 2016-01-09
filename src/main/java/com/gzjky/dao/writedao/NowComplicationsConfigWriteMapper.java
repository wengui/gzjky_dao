package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.NowComplicationsConfig;

public interface NowComplicationsConfigWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NowComplicationsConfig record);

    int insertSelective(NowComplicationsConfig record);

    int updateByPrimaryKeySelective(NowComplicationsConfig record);

    int updateByPrimaryKey(NowComplicationsConfig record);
}