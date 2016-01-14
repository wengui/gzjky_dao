package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.TreeNodesBean;
import com.gzjky.bean.gen.DictionaryInfo;

public interface DictionaryInfoReadMapper {

    DictionaryInfo selectByPrimaryKey(Integer id);
    
    List<TreeNodesBean> selectTreeNodes();
}