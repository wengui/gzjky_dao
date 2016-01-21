package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MedicinesCate;

public interface MedicinesCateWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicinesCate record);

    int insertSelective(MedicinesCate record);

    int updateByPrimaryKeySelective(MedicinesCate record);

    int updateByPrimaryKey(MedicinesCate record);
}