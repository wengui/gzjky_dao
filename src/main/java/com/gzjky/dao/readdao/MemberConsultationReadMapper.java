package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.MemberConsultationInputBean;
import com.gzjky.bean.extend.MemberConsultationOutputBean;
import com.gzjky.bean.extend.QueryMemberConsultationOutPutBean;
import com.gzjky.bean.gen.MemberConsultation;

public interface MemberConsultationReadMapper {

    MemberConsultation selectByPrimaryKey(Integer id);
    QueryMemberConsultationOutPutBean selectByPatientID(Integer patientId);
	
	List<MemberConsultationOutputBean> selectByPatientId(MemberConsultationInputBean record);
}