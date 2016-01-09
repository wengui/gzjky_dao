package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.EquipmentAndPatient;

public interface EquipmentAndPatientReadMapper {
	
    EquipmentAndPatient selectByPrimaryKey(Integer id);

}