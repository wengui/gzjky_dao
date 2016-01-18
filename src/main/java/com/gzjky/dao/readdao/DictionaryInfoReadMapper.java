package com.gzjky.dao.readdao;

import java.util.List;

import com.gzjky.bean.extend.DictionaryInfoBean;
import com.gzjky.bean.extend.TreeNodesBean;
import com.gzjky.bean.gen.DictionaryInfo;

public interface DictionaryInfoReadMapper {

    DictionaryInfo selectByPrimaryKey(Integer id);
    List<DictionaryInfoBean> selectDictionaryInfo(List list);
    
    List<TreeNodesBean> selectTreeNodes();
}