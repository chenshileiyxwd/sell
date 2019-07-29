package com.imooc.dataobject.mapper;

import com.pojo.SellerInfo;
import com.pojo.SellerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerInfoMapper {
    int countByExample(SellerInfoExample example);

    int deleteByExample(SellerInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    List<SellerInfo> selectByExample(SellerInfoExample example);

    SellerInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByExample(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);
}