package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.PatientNowComplicationsMaster;

public interface PatientNowComplicationsMasterWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientNowComplicationsMaster record);

    int insertSelective(PatientNowComplicationsMaster record);

    int updateByPrimaryKeySelective(PatientNowComplicationsMaster record);

    int updateByPrimaryKey(PatientNowComplicationsMaster record);
}