package com.gzjky.dao.writedao;

import com.gzjky.bean.gen.MedicinesName;

public interface MedicinesNameWriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicinesName record);

    int insertSelective(MedicinesName record);

    int updateByPrimaryKeySelective(MedicinesName record);

    int updateByPrimaryKey(MedicinesName record);
}