package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.RolePowers;
import org.apache.ibatis.annotations.Param;

public interface RolePowersWriteMapper {
    int deleteByPrimaryKey(@Param("roleid") Integer roleid, @Param("powerid") Integer powerid);

    int insert(RolePowers record);

    int insertSelective(RolePowers record);
}