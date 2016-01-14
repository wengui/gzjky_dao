package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DictionaryInfo;

public interface DictionaryInfoReadMapper {

    DictionaryInfo selectByPrimaryKey(Integer id);
}