package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.Equipment;

public interface EquipmentWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
    
    int updateSimByPrimarKey(@Param("id")Integer id,@Param("sim")String sim );
    
}