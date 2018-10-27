package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRole;

public interface AmRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmRole record);

    int insertSelective(AmRole record);

    AmRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmRole record);

    int updateByPrimaryKey(AmRole record);
}