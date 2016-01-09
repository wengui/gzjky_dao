package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.RoleUsers;
import org.apache.ibatis.annotations.Param;

public interface RoleUsersReadMapper {
    
    RoleUsers selectByPrimaryKey(@Param("roleid") Integer roleid);
}