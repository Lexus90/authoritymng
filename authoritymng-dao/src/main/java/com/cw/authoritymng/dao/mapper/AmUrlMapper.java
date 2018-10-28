package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUrl;
import com.cw.authoritymng.dao.model.AmUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmUrlMapper {
    long countByExample(AmUrlExample example);

    int deleteByExample(AmUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmUrl record);

    int insertSelective(AmUrl record);

    List<AmUrl> selectByExample(AmUrlExample example);

    AmUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmUrl record, @Param("example") AmUrlExample example);

    int updateByExample(@Param("record") AmUrl record, @Param("example") AmUrlExample example);

    int updateByPrimaryKeySelective(AmUrl record);

    int updateByPrimaryKey(AmUrl record);
}