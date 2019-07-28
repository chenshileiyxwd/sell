package com.imooc.dataobject.mapper;

import com.pojo.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderDetailMapperTest {
    @Autowired
    private OrderDetailMapper mapper;
    @Test
    public void testinsert() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId(UUID.randomUUID().toString());
        orderDetail.setOrderId("1");
        orderDetail.setProductName("ddd");
        orderDetail.setProductPrice(new BigDecimal(3));
        orderDetail.setProductQuantity(3);
        int insert = mapper.insert(orderDetail);
        Assert.assertEquals(1, insert);
    }
}