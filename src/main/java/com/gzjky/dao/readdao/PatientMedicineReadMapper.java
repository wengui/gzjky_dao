package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.PatientMedicine;

public interface PatientMedicineReadMapper {

    PatientMedicine selectByPrimaryKey(Integer id);
}