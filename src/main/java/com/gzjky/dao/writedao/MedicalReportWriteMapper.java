package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MedicalReport;

public interface MedicalReportWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalReport record);

    int insertSelective(MedicalReport record);

    int updateByPrimaryKeySelective(MedicalReport record);

    int updateByPrimaryKeyWithBLOBs(MedicalReport record);

    int updateByPrimaryKey(MedicalReport record);
}