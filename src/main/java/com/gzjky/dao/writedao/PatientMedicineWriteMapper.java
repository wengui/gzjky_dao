package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientMedicine;

public interface PatientMedicineWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicine record);

    int insertSelective(PatientMedicine record);

    int updateByPrimaryKeySelective(PatientMedicine record);

    int updateByPrimaryKey(PatientMedicine record);
}