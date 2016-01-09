package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.City;

public interface CityReadMapper {

    City selectByPrimaryKey(Integer id);
}