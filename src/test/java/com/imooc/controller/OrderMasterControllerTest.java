package com.imooc.controller;

import com.imooc.SellApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
@Slf4j
@AutoConfigureMockMvc
public class OrderMasterControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void multiQry() throws Exception {
        ResultActions orderQry = mockMvc.perform(MockMvcRequestBuilders.get("/multiOrderQry?buyerName=123")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}