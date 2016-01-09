package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.TitleUsers;
import org.apache.ibatis.annotations.Param;

public interface TitleUsersReadMapper {

    TitleUsers selectByPrimaryKey(@Param("titleid") Integer titleid);
}