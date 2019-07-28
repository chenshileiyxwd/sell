package java.com.imooc.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

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
        String a = "s,d,f,asdf";
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("3");
        list.add("2");
        System.out.println(list.contains(3));
    }


    @Test
    public void getname() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.forEach(n-> System.out.println(n.toString()));
    }
}