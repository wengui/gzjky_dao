package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientLivingHabitsInfo;

public interface PatientLivingHabitsInfoWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientLivingHabitsInfo record);

    int insertSelective(PatientLivingHabitsInfo record);

    int updateByPrimaryKeySelective(PatientLivingHabitsInfo record);

    int updateByPrimaryKey(PatientLivingHabitsInfo record);
    
    int updateByPatientIdSelective(PatientLivingHabitsInfo record);
}