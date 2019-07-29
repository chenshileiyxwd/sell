package com.imooc.controller;

import com.imooc.dataobject.mapper.OrderDetailMapper;
import com.imooc.dataobject.mapper.OrderMasterMapper;
import com.pojo.OrderDetail;
import com.pojo.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName OrderMasterController
 * @Description TODO
 * @Author mrleier
 * @Date 2019/7/29 20:05
 * @Version 1.0
 **/
@Controller
@SpringBootApplication
public class OrderMasterController {
    @Autowired
    private OrderMasterMapper orderMastermapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @RequestMapping("/insertOrderMaster")
    @ResponseBody
    public void insertOrderMasterAndDetail(OrderMaster orderMaster, OrderDetail orderDetail) {
        orderMastermapper.insert(orderMaster);
        orderDetailMapper.insert(orderDetail);
    }
}
