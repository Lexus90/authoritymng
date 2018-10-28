package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceData;
import com.cw.authoritymng.dao.model.AmResourceDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmResourceDataMapper {
    long countByExample(AmResourceDataExample example);

    int deleteByExample(AmResourceDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceData record);

    int insertSelective(AmResourceData record);

    List<AmResourceData> selectByExample(AmResourceDataExample example);

    AmResourceData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmResourceData record, @Param("example") AmResourceDataExample example);

    int updateByExample(@Param("record") AmResourceData record, @Param("example") AmResourceDataExample example);

    int updateByPrimaryKeySelective(AmResourceData record);

    int updateByPrimaryKey(AmResourceData record);
}