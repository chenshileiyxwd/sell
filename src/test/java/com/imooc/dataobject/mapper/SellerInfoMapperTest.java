package com.imooc.dataobject.mapper;

import com.pojo.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerInfoMapperTest {
    @Autowired
    private SellerInfoMapper mapper;
    @Test
    public void insertSeller() {
        ArrayList<SellerInfo> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setId(UUID.randomUUID().toString().substring(0, 32));
            sellerInfo.setOpenid(i + "");
            sellerInfo.setUsername("csl" + i);
            sellerInfo.setPassword("password" + i);
            list.add(sellerInfo);
            if (i > 1 && i % 1000 == 0) {
                mapper.insertSellerInfoBatch(list);
                list.clear();
            }
        }
        mapper.insertSellerInfoBatch(list);


    }

}