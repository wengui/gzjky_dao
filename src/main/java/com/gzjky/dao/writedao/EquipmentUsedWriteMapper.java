package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.EquipmentUsed;

public interface EquipmentUsedWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentUsed record);

    int insertSelective(EquipmentUsed record);

    int updateByPrimaryKeySelective(EquipmentUsed record);

    int updateByPrimaryKey(EquipmentUsed record);
}