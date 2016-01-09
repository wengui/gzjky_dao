package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Roles;

public interface RolesReadMapper {

    Roles selectByPrimaryKey(Integer id);
}