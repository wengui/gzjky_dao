package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Configs;

public interface ConfigsReadMapper {
	
    Configs selectByPrimaryKey(Integer id);
}