package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.City;

public interface CityWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKeyWithBLOBs(City record);

    int updateByPrimaryKey(City record);
}