package com.gzjky.dao.readdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
    
    /**
     * 
     * @param patientId
     * @param cellphone
     * @return
     */
    int selectByPatientIdAndPhone(@Param("patientId")Integer patientId, @Param("cellphone")String cellphone);

}