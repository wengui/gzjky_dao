package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.DoctorAdviceOrders;

public interface DoctorAdviceOrdersWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoctorAdviceOrders record);

    int insertSelective(DoctorAdviceOrders record);

    int updateByPrimaryKeySelective(DoctorAdviceOrders record);

    int updateByPrimaryKey(DoctorAdviceOrders record);
}