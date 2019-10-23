package com.imooc.controller;

import com.imooc.dataobject.mapper.SellerInfoMapper;
import com.pojo.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SellerInfoController
 * @Description TODO
 * @Author mrleier
 * @Date 2019/10/23 23:08
 * @Version 1.0
 **/
@RestController
@SpringBootApplication
public class SellerInfoController {
    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @PostMapping("/insertsellerinfo")
    public int insertSeller(SellerInfo sellerInfo) {
        int insert = sellerInfoMapper.insert(sellerInfo);
        return insert;
    }

}
