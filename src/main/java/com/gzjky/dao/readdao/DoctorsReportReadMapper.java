package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorsReport;
import com.gzjky.bean.extend.QueryDoctorReportOutputBean;

import java.util.List;

import com.gzjky.bean.extend.QueryDoctorReportInputBean;

public interface DoctorsReportReadMapper {

    DoctorsReport selectByPrimaryKey(Integer id);
    DoctorsReport selectByPatientId(Integer id);
    List<QueryDoctorReportOutputBean> selectReportDetailByPatientId(QueryDoctorReportInputBean record);
}