package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceUrl;
import com.cw.authoritymng.dao.model.AmResourceUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmResourceUrlMapper {
    long countByExample(AmResourceUrlExample example);

    int deleteByExample(AmResourceUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceUrl record);

    int insertSelective(AmResourceUrl record);

    List<AmResourceUrl> selectByExample(AmResourceUrlExample example);

    AmResourceUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmResourceUrl record, @Param("example") AmResourceUrlExample example);

    int updateByExample(@Param("record") AmResourceUrl record, @Param("example") AmResourceUrlExample example);

    int updateByPrimaryKeySelective(AmResourceUrl record);

    int updateByPrimaryKey(AmResourceUrl record);
}