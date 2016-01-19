package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorAdvice;
import com.gzjky.bean.extend.QueryDoctorAdviceOutputBean;
import java.util.List;

public interface DoctorAdviceReadMapper {

    DoctorAdvice selectByPrimaryKey(Integer id);
    
    List<QueryDoctorAdviceOutputBean> selectByPatientID(Integer id);
}