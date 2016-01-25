package com.gzjky.dao.writedao;

import org.apache.ibatis.annotations.Param;

import com.gzjky.bean.gen.JcCytxSet;

public interface JcCytxSetWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JcCytxSet record);

    int insertSelective(JcCytxSet record);

    int updateByPrimaryKeySelective(JcCytxSet record);

    int updateByPrimaryKey(JcCytxSet record);
    
    int updateStateByPrimaryKey(@Param("isdelete")Integer isdelete,@Param("id")Integer id);
    int updateStateByEidAndPid(@Param("isdelete")Integer isdelete,@Param("eid")Integer eid,@Param("uid")String uid);
}