package com.demo.mapper.marketing_platform;

import com.demo.entity.RsCategory;
import com.demo.entity.RsCategoryExample;
import com.demo.entity.RsCategoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsCategoryMapper {
    long countByExample(RsCategoryExample example);

    int deleteByExample(RsCategoryExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(RsCategoryWithBLOBs record);

    int insertSelective(RsCategoryWithBLOBs record);

    List<RsCategoryWithBLOBs> selectByExampleWithBLOBs(RsCategoryExample example);

    List<RsCategory> selectByExample(RsCategoryExample example);

    RsCategoryWithBLOBs selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") RsCategoryWithBLOBs record, @Param("example") RsCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") RsCategoryWithBLOBs record, @Param("example") RsCategoryExample example);

    int updateByExample(@Param("record") RsCategory record, @Param("example") RsCategoryExample example);

    int updateByPrimaryKeySelective(RsCategoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RsCategoryWithBLOBs record);

    int updateByPrimaryKey(RsCategory record);
}