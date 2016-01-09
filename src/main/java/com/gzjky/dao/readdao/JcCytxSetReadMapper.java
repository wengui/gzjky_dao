package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.JcCytxSet;

public interface JcCytxSetReadMapper {

    JcCytxSet selectByPrimaryKey(Integer id);
}