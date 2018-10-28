package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmResourceUi;
import com.cw.authoritymng.dao.model.AmResourceUiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmResourceUiMapper {
    long countByExample(AmResourceUiExample example);

    int deleteByExample(AmResourceUiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmResourceUi record);

    int insertSelective(AmResourceUi record);

    List<AmResourceUi> selectByExample(AmResourceUiExample example);

    AmResourceUi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmResourceUi record, @Param("example") AmResourceUiExample example);

    int updateByExample(@Param("record") AmResourceUi record, @Param("example") AmResourceUiExample example);

    int updateByPrimaryKeySelective(AmResourceUi record);

    int updateByPrimaryKey(AmResourceUi record);
}