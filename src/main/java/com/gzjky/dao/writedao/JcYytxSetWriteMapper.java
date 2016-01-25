package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcYytxSet;

public interface JcYytxSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcYytxSet record);

    int insertSelective(JcYytxSet record);

    int updateByPrimaryKeySelective(JcYytxSet record);

    int updateByPrimaryKey(JcYytxSet record);
    
    int updateStateByPrimaryKey(@Param("isdelete")Integer isdelete,@Param("id")Integer id);
    
    int updateStateByEidAndPid(@Param("isdelete")Integer isdelete,@Param("eid")Integer eid,@Param("uid")String uid);
    
}