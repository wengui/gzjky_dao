package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MigrationHistory;
import org.apache.ibatis.annotations.Param;

public interface MigrationHistoryWriteMapper {
    int deleteByPrimaryKey(@Param("migrationid") String migrationid, @Param("contextkey") String contextkey);

    int insert(MigrationHistory record);

    int insertSelective(MigrationHistory record);

    int updateByPrimaryKeySelective(MigrationHistory record);

    int updateByPrimaryKeyWithBLOBs(MigrationHistory record);

    int updateByPrimaryKey(MigrationHistory record);
}