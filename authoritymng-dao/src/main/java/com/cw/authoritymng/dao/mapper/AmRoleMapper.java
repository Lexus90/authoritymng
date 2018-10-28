package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRole;
import com.cw.authoritymng.dao.model.AmRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmRoleMapper {
    long countByExample(AmRoleExample example);

    int deleteByExample(AmRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmRole record);

    int insertSelective(AmRole record);

    List<AmRole> selectByExample(AmRoleExample example);

    AmRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmRole record, @Param("example") AmRoleExample example);

    int updateByExample(@Param("record") AmRole record, @Param("example") AmRoleExample example);

    int updateByPrimaryKeySelective(AmRole record);

    int updateByPrimaryKey(AmRole record);
}