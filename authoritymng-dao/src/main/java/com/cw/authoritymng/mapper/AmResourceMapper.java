package com.cw.authoritymng.mapper;

import com.cw.authoritymng.model.AmResource;

public interface AmResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResource record);

    int insertSelective(AmResource record);

    AmResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResource record);

    int updateByPrimaryKey(AmResource record);
}