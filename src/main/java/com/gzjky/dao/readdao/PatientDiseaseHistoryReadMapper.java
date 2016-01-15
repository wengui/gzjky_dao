package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.PatientDiseaseHistoryInputBean;
import com.gzjky.bean.extend.PatientDiseaseHistoryOutputBean;
import com.gzjky.bean.gen.PatientDiseaseHistory;

public interface PatientDiseaseHistoryReadMapper {

    PatientDiseaseHistory selectByPrimaryKey(Integer id);
    
    
    /**
     * 根据患者ID查询疾病史
     * @param PatientDiseaseHistoryInputBean
     * @return
     */
    List<PatientDiseaseHistoryOutputBean> selectByPatientId(PatientDiseaseHistoryInputBean record);
}