package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.FamilyPhoneOutputBean;
import com.gzjky.bean.gen.FamilyPhone;

public interface FamilyPhoneReadMapper {

    FamilyPhone selectByPrimaryKey(Integer id);
    
    /**
     * 
     * @param patientId
     * @return
     */
    List<FamilyPhoneOutputBean> selectByPatientId(Integer patientId);

}