package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.DoctorAdviceOrders;

public interface DoctorAdviceOrdersReadMapper {
	
    DoctorAdviceOrders selectByPrimaryKey(Integer id);
}