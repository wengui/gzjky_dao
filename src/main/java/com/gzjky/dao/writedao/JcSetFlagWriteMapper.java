package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.JcSetFlag;
import com.gzjky.bean.gen.JcXlbjSet;

public interface JcSetFlagWriteMapper {
    int insert(JcSetFlag record);

    int insertSelective(JcSetFlag record);
    
    int updateByEidAndPid(JcSetFlag record);
}