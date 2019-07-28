package com.imooc.controller;

import com.imooc.dataobject.mapper.ProductCategoryMapper;
import com.pojo.ProductCategory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName mancontroller
 * @Description TODO
 * @Author mrleier
 * @Date 2019/5/23 22:44
 * @Version 1.0
 **/
@Controller
@SpringBootApplication
public class mancontroller {
    private ProductCategoryMapper mapper;
    @RequestMapping("/index")
    public String gotoIndexPage() {
        return "index";
    }

    @RequestMapping("/index/name")
    public String gotoNamePage() {
        return "namelist";
    }

    @RequestMapping("/index/getAllCategory/{categoryId}")
    @ResponseBody
    public ProductCategory getcate(Integer categoryId) {
        ProductCategory productCategory = mapper.selectByPrimaryKey(categoryId);
        return productCategory;
    }
}
