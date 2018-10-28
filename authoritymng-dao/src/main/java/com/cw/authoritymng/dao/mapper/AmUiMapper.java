package com.cw.authoritymng.dao.mapper;

import com.cw.authoritymng.dao.model.AmUi;
import com.cw.authoritymng.dao.model.AmUiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmUiMapper {
    long countByExample(AmUiExample example);

    int deleteByExample(AmUiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmUi record);

    int insertSelective(AmUi record);

    List<AmUi> selectByExample(AmUiExample example);

    AmUi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmUi record, @Param("example") AmUiExample example);

    int updateByExample(@Param("record") AmUi record, @Param("example") AmUiExample example);

    int updateByPrimaryKeySelective(AmUi record);

    int updateByPrimaryKey(AmUi record);
}