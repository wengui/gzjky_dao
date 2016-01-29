package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.Onlines;

public interface OnlinesWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Onlines record);

    int insertSelective(Onlines record);

    int updateByPrimaryKeySelective(Onlines record);

    int updateByPrimaryKey(Onlines record);
  
    int updateByByUserId(@Param("record")Onlines record,@Param("userid")Integer userid);
}