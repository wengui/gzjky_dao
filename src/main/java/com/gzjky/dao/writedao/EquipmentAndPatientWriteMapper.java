package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.EquipmentAndPatient;

public interface EquipmentAndPatientWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentAndPatient record);

    int insertSelective(EquipmentAndPatient record);

    int updateByPrimaryKeySelective(EquipmentAndPatient record);

    int updateByPrimaryKey(EquipmentAndPatient record);
}