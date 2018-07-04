package com.demo.mapper.marketing_platform;

import com.demo.entity.RsGoods;
import com.demo.entity.RsGoodsExample;
import com.demo.entity.RsGoodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsGoodsMapper {
    long countByExample(RsGoodsExample example);

    int deleteByExample(RsGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(RsGoodsWithBLOBs record);

    int insertSelective(RsGoodsWithBLOBs record);

    List<RsGoodsWithBLOBs> selectByExampleWithBLOBs(RsGoodsExample example);

    List<RsGoods> selectByExample(RsGoodsExample example);

    RsGoodsWithBLOBs selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") RsGoodsWithBLOBs record, @Param("example") RsGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") RsGoodsWithBLOBs record, @Param("example") RsGoodsExample example);

    int updateByExample(@Param("record") RsGoods record, @Param("example") RsGoodsExample example);

    int updateByPrimaryKeySelective(RsGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RsGoodsWithBLOBs record);

    int updateByPrimaryKey(RsGoods record);
}