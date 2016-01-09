package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.TitleUsers;
import org.apache.ibatis.annotations.Param;

public interface TitleUsersWriteMapper {
    int deleteByPrimaryKey(@Param("titleid") Integer titleid, @Param("userid") Integer userid);

    int insert(TitleUsers record);

    int insertSelective(TitleUsers record);
}