package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResource;

public interface AmResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResource record);

    int insertSelective(AmResource record);

    AmResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResource record);

    int updateByPrimaryKey(AmResource record);
}