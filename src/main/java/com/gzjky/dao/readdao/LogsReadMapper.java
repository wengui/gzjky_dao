package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Logs;

public interface LogsReadMapper {

    Logs selectByPrimaryKey(Integer id);
}