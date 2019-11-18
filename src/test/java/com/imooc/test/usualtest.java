package com.imooc.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @ClassName usualtest
 * @Description TODO
 * @Author mrleier
 * @Date 2019/5/15 22:42
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class usualtest {
    @Test
    public void test() {
        int sum = 100000;
        for (int i = 0; i < sum; i++) {
                if (i % 2 == 1 &&
                    i % 3 == 0 &&
                    i % 4 == 1 &&
                    (i + 1) % 5 == 0 &&
                    i % 6 == 3 &&
                    i % 7 == 0 &&
                    i % 8 == 1 &&
                    i % 9 == 0

            ) {
                System.out.println("i = " + i);
            }
        }


    }


    private Date date;


    @Test
    public void getname() {
        int arr[] = {1, 5, 6, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("vim test");
        System.out.println("arr = " + arr);

    }


}


