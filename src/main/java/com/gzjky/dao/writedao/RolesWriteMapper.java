package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Roles;

public interface RolesWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}