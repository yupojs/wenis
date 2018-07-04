package com.demo.mapper.marketing_platform;

import com.demo.entity.RsCategoryMulti;
import com.demo.entity.RsCategoryMultiExample;
import com.demo.entity.RsCategoryMultiWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsCategoryMultiMapper {
    long countByExample(RsCategoryMultiExample example);

    int deleteByExample(RsCategoryMultiExample example);

    int deleteByPrimaryKey(Integer multiId);

    int insert(RsCategoryMultiWithBLOBs record);

    int insertSelective(RsCategoryMultiWithBLOBs record);

    List<RsCategoryMultiWithBLOBs> selectByExampleWithBLOBs(RsCategoryMultiExample example);

    List<RsCategoryMulti> selectByExample(RsCategoryMultiExample example);

    RsCategoryMultiWithBLOBs selectByPrimaryKey(Integer multiId);

    int updateByExampleSelective(@Param("record") RsCategoryMultiWithBLOBs record, @Param("example") RsCategoryMultiExample example);

    int updateByExampleWithBLOBs(@Param("record") RsCategoryMultiWithBLOBs record, @Param("example") RsCategoryMultiExample example);

    int updateByExample(@Param("record") RsCategoryMulti record, @Param("example") RsCategoryMultiExample example);

    int updateByPrimaryKeySelective(RsCategoryMultiWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RsCategoryMultiWithBLOBs record);

    int updateByPrimaryKey(RsCategoryMulti record);
}