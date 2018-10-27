package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUser;

import java.util.List;

public interface AmUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    AmUser selectByPrimaryKey(Integer id);

    List<AmUser> selectAllAmUser();

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);
}