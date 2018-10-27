package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRoleUser;

public interface AmRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmRoleUser record);

    int insertSelective(AmRoleUser record);

    AmRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmRoleUser record);

    int updateByPrimaryKey(AmRoleUser record);
}