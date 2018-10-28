package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUser;
import com.cw.authoritymng.dao.model.AmUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmUserMapper {
    long countByExample(AmUserExample example);

    int deleteByExample(AmUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    List<AmUser> selectByExample(AmUserExample example);

    AmUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByExample(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);
}