package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.NowComplicationsConfig;

public interface NowComplicationsConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NowComplicationsConfig record);

    int insertSelective(NowComplicationsConfig record);

    NowComplicationsConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NowComplicationsConfig record);

    int updateByPrimaryKey(NowComplicationsConfig record);
}