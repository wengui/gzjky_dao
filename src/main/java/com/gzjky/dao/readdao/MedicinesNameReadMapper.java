package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.MedicineInputBean;
import com.gzjky.bean.extend.MedicineOutputBean;
import com.gzjky.bean.gen.MedicinesName;

public interface MedicinesNameReadMapper {

    MedicinesName selectByPrimaryKey(Integer id);
    
    List<MedicineOutputBean> selectList(MedicineInputBean record);
}