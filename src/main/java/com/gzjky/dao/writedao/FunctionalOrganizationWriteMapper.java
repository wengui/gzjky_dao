package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.FunctionalOrganization;

public interface FunctionalOrganizationWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FunctionalOrganization record);

    int insertSelective(FunctionalOrganization record);

    int updateByPrimaryKeySelective(FunctionalOrganization record);

    int updateByPrimaryKeyWithBLOBs(FunctionalOrganization record);

    int updateByPrimaryKey(FunctionalOrganization record);
}