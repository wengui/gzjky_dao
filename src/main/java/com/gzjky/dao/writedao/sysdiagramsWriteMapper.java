package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.sysdiagrams;

public interface sysdiagramsWriteMapper {
    int deleteByPrimaryKey(Integer diagramId);

    int insert(sysdiagrams record);

    int insertSelective(sysdiagrams record);

    int updateByPrimaryKeySelective(sysdiagrams record);

    int updateByPrimaryKeyWithBLOBs(sysdiagrams record);

    int updateByPrimaryKey(sysdiagrams record);
}