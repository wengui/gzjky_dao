package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Consultation;

public interface ConsultationWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consultation record);

    int insertSelective(Consultation record);

    int updateByPrimaryKeySelective(Consultation record);

    int updateByPrimaryKey(Consultation record);
}