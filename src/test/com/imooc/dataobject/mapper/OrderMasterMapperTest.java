package com.imooc.dataobject.mapper;

import com.pojo.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterMapperTest {
    @Autowired
    private OrderMasterMapper mapper;

    @Test
    public void inserOrder() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("麒麟街");
        orderMaster.setBuyerName("test");
        orderMaster.setBuyerOpenid("123");
        orderMaster.setBuyerPhone("123");
        orderMaster.setCreateTime(new Date());
        orderMaster.setOrderAmount(new BigDecimal(1));
        orderMaster.setOrderId("2");
        orderMaster.setOrderStatus((byte) '1');
        orderMaster.setPayStatus((byte) '1');
        orderMaster.setUpdateTime(new Date());
        int i = mapper.insertSelective(orderMaster);
        Assert.assertEquals(1, i);

    }

}