package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.FamilyPhone;

public interface FamilyPhoneWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyPhone record);

    int insertSelective(FamilyPhone record);

    int updateByPrimaryKeySelective(FamilyPhone record);

    int updateByPrimaryKey(FamilyPhone record);
}