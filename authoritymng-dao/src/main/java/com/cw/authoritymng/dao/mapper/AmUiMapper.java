package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUi;

public interface AmUiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmUi record);

    int insertSelective(AmUi record);

    AmUi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmUi record);

    int updateByPrimaryKey(AmUi record);
}