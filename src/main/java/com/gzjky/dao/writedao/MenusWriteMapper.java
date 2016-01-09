package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Menus;

public interface MenusWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menus record);

    int insertSelective(Menus record);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}