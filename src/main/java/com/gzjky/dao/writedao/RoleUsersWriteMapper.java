package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.RoleUsers;
import org.apache.ibatis.annotations.Param;

public interface RoleUsersWriteMapper {
    int deleteByPrimaryKey(@Param("roleid") Integer roleid, @Param("userid") Integer userid);

    int insert(RoleUsers record);

    int insertSelective(RoleUsers record);
}