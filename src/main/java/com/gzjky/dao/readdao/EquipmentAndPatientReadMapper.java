package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.PatientAndEquipmentBean;
import com.gzjky.bean.gen.EquipmentAndPatient;
import com.gzjky.bean.gen.PatientInfo;

public interface EquipmentAndPatientReadMapper {
	
    EquipmentAndPatient selectByPrimaryKey(Integer id);
    
    List<PatientAndEquipmentBean> selectByPatientId(Integer patientId);
    
    List<PatientInfo> selectByEquipNum(String EquipmentNum);
    
}