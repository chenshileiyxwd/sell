package com.imooc.dataobject.mapper;

import com.pojo.ProductCategory;
import com.pojo.ProductCategoryExample;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {
    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void testsle() {
        ProductCategoryExample example = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryTypeEqualTo(101);
        List<ProductCategory> productCategories = mapper.selectByExample(example);
        productCategories.forEach(n -> System.out.println(n.toString()));
    }

    @Test
    public void delCategroty() {
        int categoryId = 3;
        int i = mapper.deleteByPrimaryKey(categoryId);
        Assert.assertEquals(1, i);
    }

    @Test
    public void insertCategory() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("cat2");
        productCategory.setCategoryType(103);
        int insert = mapper.insert(productCategory);
        Assert.assertEquals(1, insert);
    }

    @Test
    public void selectAll() {
        ProductCategoryExample example = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdGreaterThan(0);
        List<ProductCategory> productCategories = mapper.selectByExample(example);
        productCategories.forEach(item -> System.out.println(item.toString()));
    }

}