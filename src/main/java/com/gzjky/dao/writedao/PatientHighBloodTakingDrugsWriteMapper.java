package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientHighBloodTakingDrugs;

public interface PatientHighBloodTakingDrugsWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientHighBloodTakingDrugs record);

    int insertSelective(PatientHighBloodTakingDrugs record);

    int updateByPrimaryKeySelective(PatientHighBloodTakingDrugs record);

    int updateByPrimaryKey(PatientHighBloodTakingDrugs record);
}