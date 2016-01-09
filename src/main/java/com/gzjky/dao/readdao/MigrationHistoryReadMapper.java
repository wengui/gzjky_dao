package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.MigrationHistory;
import org.apache.ibatis.annotations.Param;

public interface MigrationHistoryReadMapper {
	
    MigrationHistory selectByPrimaryKey(@Param("migrationid") String migrationid, @Param("contextkey") String contextkey);
}