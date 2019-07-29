package com.imooc.dataobject.mapper;

import java.util.List;
import java.util.Map;

public interface MultiTabQryMapper {
    /**
     * 多表关联查询案例
     * @param buyername
     * @return
     */
    public List<Map<String, Object>> qryOrderMasterAndDetailByBuyerName(String buyername);
}
