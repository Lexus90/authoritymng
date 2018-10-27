package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceUi;

public interface AmResourceUiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceUi record);

    int insertSelective(AmResourceUi record);

    AmResourceUi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmResourceUi record);

    int updateByPrimaryKey(AmResourceUi record);
}