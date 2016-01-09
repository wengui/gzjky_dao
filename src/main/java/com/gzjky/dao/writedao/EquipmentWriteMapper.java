package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Equipment;

public interface EquipmentWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}