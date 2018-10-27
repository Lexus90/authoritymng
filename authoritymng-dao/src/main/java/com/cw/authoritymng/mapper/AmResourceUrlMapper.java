package com.cw.authoritymng.mapper;

import com.cw.authoritymng.model.AmResourceUrl;

public interface AmResourceUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceUrl record);

    int insertSelective(AmResourceUrl record);

    AmResourceUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResourceUrl record);

    int updateByPrimaryKey(AmResourceUrl record);
}