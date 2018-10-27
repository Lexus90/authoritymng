package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRoleResource;

public interface AmRoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmRoleResource record);

    int insertSelective(AmRoleResource record);

    AmRoleResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmRoleResource record);

    int updateByPrimaryKey(AmRoleResource record);
}