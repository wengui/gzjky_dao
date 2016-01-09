package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Titles;

public interface TitlesReadMapper {

    Titles selectByPrimaryKey(Integer id);
}