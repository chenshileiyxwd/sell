package com.imooc.controller;

import com.imooc.dataobject.mapper.ProductCategoryMapper;
import com.pojo.ProductCategory;
import com.pojo.ProductCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName mancontroller
 * @Description TODO
 * @Author mrleier
 * @Date 2019/5/23 22:44
 * @Version 1.0
 **/
@RestController
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

    @RequestMapping("/index/getAllCategory")
    public ProductCategory getcate(@RequestParam("categoryId") Integer id) {
//        ProductCategory productCategory = mapper.selectByPrimaryKey(id);
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(1);
        productCategory.setCategoryName("sdfs");
        productCategory.setCategoryId(1);
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        return productCategory;
    }

    @RequestMapping("/getallcat")
    public List<ProductCategory> getall() {
        ProductCategoryExample example = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdGreaterThan(0);
        List<ProductCategory> productCategories = mapper.selectByExample(example);
        return productCategories;
    }
    @RequestMapping("/getmap")
     public Map<String, String> testMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        return map;
    }
}
