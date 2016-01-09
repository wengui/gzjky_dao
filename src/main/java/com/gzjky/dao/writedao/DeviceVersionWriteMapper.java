package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DeviceVersion;

public interface DeviceVersionWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceVersion record);

    int insertSelective(DeviceVersion record);

    int updateByPrimaryKeySelective(DeviceVersion record);

    int updateByPrimaryKey(DeviceVersion record);
}