package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorsReport;

public interface DoctorsReportReadMapper {

    DoctorsReport selectByPrimaryKey(Integer id);
}