package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResource;
import com.cw.authoritymng.dao.model.AmResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmResourceMapper {
    long countByExample(AmResourceExample example);

    int deleteByExample(AmResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmResource record);

    int insertSelective(AmResource record);

    List<AmResource> selectByExample(AmResourceExample example);

    AmResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmResource record, @Param("example") AmResourceExample example);

    int updateByExample(@Param("record") AmResource record, @Param("example") AmResourceExample example);

    int updateByPrimaryKeySelective(AmResource record);

    int updateByPrimaryKey(AmResource record);
}