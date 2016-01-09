package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.MedicalReport;

public interface MedicalReportReadMapper {

    MedicalReport selectByPrimaryKey(Integer id);
}