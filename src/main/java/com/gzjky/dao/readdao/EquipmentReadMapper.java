package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Equipment;

public interface EquipmentReadMapper {

    Equipment selectByPrimaryKey(Integer id);
}