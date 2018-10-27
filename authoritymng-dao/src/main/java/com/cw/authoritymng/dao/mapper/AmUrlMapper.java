package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUrl;

public interface AmUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmUrl record);

    int insertSelective(AmUrl record);

    AmUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmUrl record);

    int updateByPrimaryKey(AmUrl record);
}