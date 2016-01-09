package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.ConsultationResult;

public interface ConsultationResultWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConsultationResult record);

    int insertSelective(ConsultationResult record);

    int updateByPrimaryKeySelective(ConsultationResult record);

    int updateByPrimaryKey(ConsultationResult record);
}