package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmRoleResource;
import com.cw.authoritymng.dao.model.AmRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmRoleResourceMapper {
    long countByExample(AmRoleResourceExample example);

    int deleteByExample(AmRoleResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmRoleResource record);

    int insertSelective(AmRoleResource record);

    List<AmRoleResource> selectByExample(AmRoleResourceExample example);

    AmRoleResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmRoleResource record, @Param("example") AmRoleResourceExample example);

    int updateByExample(@Param("record") AmRoleResource record, @Param("example") AmRoleResourceExample example);

    int updateByPrimaryKeySelective(AmRoleResource record);

    int updateByPrimaryKey(AmRoleResource record);
}