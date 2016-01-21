package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.gen.MedicinesCate;

public interface MedicinesCateReadMapper {

    MedicinesCate selectByPrimaryKey(Integer id);
    
    List<MedicinesCate> selectAllRecord();
}