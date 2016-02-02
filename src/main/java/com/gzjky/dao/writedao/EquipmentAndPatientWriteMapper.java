package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.EquipmentAndPatient;

public interface EquipmentAndPatientWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentAndPatient record);

    int insertSelective(EquipmentAndPatient record);

    int updateByPrimaryKeySelective(EquipmentAndPatient record);

    int updateByPrimaryKey(EquipmentAndPatient record);
    
    int updateDeleteFlagByPrimaryKey(Integer id);
    
    int updateNicknameByPrimaryKey(@Param("id")Integer id,@Param("nickname")String nickname );
}