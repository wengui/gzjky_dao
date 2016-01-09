package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.Partners;

public interface PartnersWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Partners record);

    int insertSelective(Partners record);

    int updateByPrimaryKeySelective(Partners record);

    int updateByPrimaryKeyWithBLOBs(Partners record);

    int updateByPrimaryKey(Partners record);
}