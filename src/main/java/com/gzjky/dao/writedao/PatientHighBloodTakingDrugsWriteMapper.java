package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.PatientHighBloodTakingDrugs;

public interface PatientHighBloodTakingDrugsWriteMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByPatientHighBloodInfoId(@Param("patienthighbloodinfoid")Integer patienthighbloodinfoid);

    int insert(PatientHighBloodTakingDrugs record);

    int insertSelective(PatientHighBloodTakingDrugs record);

    int updateByPrimaryKeySelective(PatientHighBloodTakingDrugs record);

    int updateByPrimaryKey(PatientHighBloodTakingDrugs record);
}