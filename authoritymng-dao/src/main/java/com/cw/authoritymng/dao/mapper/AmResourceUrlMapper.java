package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceUrl;

public interface AmResourceUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceUrl record);

    int insertSelective(AmResourceUrl record);

    AmResourceUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResourceUrl record);

    int updateByPrimaryKey(AmResourceUrl record);
}