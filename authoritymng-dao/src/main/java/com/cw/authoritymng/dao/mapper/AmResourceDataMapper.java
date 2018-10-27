package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceData;

public interface AmResourceDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceData record);

    int insertSelective(AmResourceData record);

    AmResourceData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResourceData record);

    int updateByPrimaryKey(AmResourceData record);
}