package com.imooc.controller;

import com.imooc.dataobject.mapper.ProductCategoryMapper;
import com.pojo.ProductCategory;
import com.pojo.ProductCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    @Autowired
    private ProductCategoryMapper mapper;

    @RequestMapping("/index")
    public String gotoIndexPage() {
        return "index";
    }

    @RequestMapping("/index/name")
    public String
    gotoNamePage() {
        return "namelist";
    }

    @RequestMapping("/index/getAllCategory/{categoryId}")
    @ResponseBody
    public ProductCategory getcate(Integer categoryId) {
        ProductCategory productCategory = mapper.selectByPrimaryKey(categoryId);
        return productCategory;
    }

    @RequestMapping("/getallcat")
    @ResponseBody
    public List<ProductCategory> getall() {
        ProductCategoryExample example = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdGreaterThan(0);
        List<ProductCategory> productCategories = mapper.selectByExample(example);
        return productCategories;
    }
}
