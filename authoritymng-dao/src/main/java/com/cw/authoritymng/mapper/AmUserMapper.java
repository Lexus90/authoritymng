package com.cw.authoritymng.mapper;

import com.cw.authoritymng.model.AmUser;

import java.util.List;

public interface AmUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    AmUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);

    List<AmUser> selectAllAmUser();
}