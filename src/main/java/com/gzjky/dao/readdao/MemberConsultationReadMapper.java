package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.MemberConsultation;

public interface MemberConsultationReadMapper {

    MemberConsultation selectByPrimaryKey(Integer id);
}