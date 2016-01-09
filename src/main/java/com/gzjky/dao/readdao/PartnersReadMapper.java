package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Partners;

public interface PartnersReadMapper {
	
    Partners selectByPrimaryKey(Integer id);
}