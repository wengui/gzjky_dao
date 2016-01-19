package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.MemberConsultation;
import com.gzjky.bean.extend.QueryMemberConsultationOutPutBean;

public interface MemberConsultationReadMapper {

    MemberConsultation selectByPrimaryKey(Integer id);
    QueryMemberConsultationOutPutBean selectByPatientID(Integer patientId);
}