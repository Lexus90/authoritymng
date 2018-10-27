package com.cw.authoritymng.mapper;

import com.cw.authoritymng.model.AmResourceData;

public interface AmResourceDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceData record);

    int insertSelective(AmResourceData record);

    AmResourceData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResourceData record);

    int updateByPrimaryKey(AmResourceData record);
}