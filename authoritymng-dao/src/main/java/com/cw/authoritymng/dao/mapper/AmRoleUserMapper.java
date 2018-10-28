package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRoleUser;
import com.cw.authoritymng.dao.model.AmRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmRoleUserMapper {
    long countByExample(AmRoleUserExample example);

    int deleteByExample(AmRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmRoleUser record);

    int insertSelective(AmRoleUser record);

    List<AmRoleUser> selectByExample(AmRoleUserExample example);

    AmRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmRoleUser record, @Param("example") AmRoleUserExample example);

    int updateByExample(@Param("record") AmRoleUser record, @Param("example") AmRoleUserExample example);

    int updateByPrimaryKeySelective(AmRoleUser record);

    int updateByPrimaryKey(AmRoleUser record);
}