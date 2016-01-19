package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MemberConsultation;

public interface MemberConsultationWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberConsultation record);

    int insertSelective(MemberConsultation record);

    int updateByPrimaryKeySelective(MemberConsultation record);

    int updateByPrimaryKey(MemberConsultation record);
}