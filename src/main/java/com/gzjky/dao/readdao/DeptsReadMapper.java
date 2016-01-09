package com.gzjky.dao.readdao;

import com.gzjky.bean.gen.Depts;

public interface DeptsReadMapper {

    Depts selectByPrimaryKey(Integer id);

}