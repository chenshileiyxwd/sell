package testThread;

import com.imooc.entity.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * @ClassName Java8StreamTest
 * @Description java8 test
 * @Author mrleier
 * @Date 2020/4/1 19:58
 * @Version 1.0
 **/
public class Java8StreamTest {
    @Test
    public void testJava8Stream() {
        ArrayList<Person> list = new ArrayList<>();
        Person person = new Person("csl", "麒麟新村", 30, true);
        list.add(person);
        person = new Person("csc", "麒麟街56号", 32, true);
        list.add(person);
        person = new Person("csm", "麒麟街56-1号", 20, true);
        list.add(person);
        person = new Person("cyy", "麒麟街56-1号", 24, false);
        list.add(person);
        person = new Person("cyy", "麒麟街56-1号", 24, false);
        list.add(person);
        System.out.println("*******************初始化5条数据,两条重复数据************************");
        list.forEach(System.out::println);
        System.out.println("*******************判断是否所有记录都能符合条件************************");
        System.out.println("stream.allMatch(p -> p.getAge() > 18) = " + list.stream().allMatch(p -> p.getAge() > 18));
        System.out.println("******************根据年龄排序,两种写法*************************");
        //        list.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(System
        //        .out::println);
        list.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
        System.out.println("***************判断是否存在年龄等于24的记录****************************");
        System.out.println(
                "list.stream().anyMatch(p -> p.getAge() == 24) = " + list.stream().anyMatch(p -> p.getAge() == 24));
        System.out.println("*****************匹配到记录则返回false，否则返回true**************************");
        System.out.println("list.stream().noneMatch(p -> p.getName().equals(\"csl\")) = " +
                list.stream().noneMatch(p -> p.getName().equals("csl")));
        System.out.println("*******************计算总数************************");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 23);
        Integer totalNbr = integers.stream().reduce(0, Integer::sum);
        System.out.println("totalNbr = " + totalNbr);
        System.out.println("********************计算所有人员的总年龄***********************");
        Stream<Integer> integerStream = list.stream().map(Person::getAge);
        Optional<Integer> totalAge = integerStream.reduce(Integer::sum);
        System.out.println("totalAge = " + totalAge);
        System.out.println("*********************过滤年龄大于30**********************");
        list.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
        System.out.println("*********************筛选出前三条数据**********************");
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("*********************跳过前三条数据**********************");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("*********************排重**********************");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("*********************返回并行流,多核CPU时效率会很高,但是不保证顺序**********************");
        list.parallelStream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
        System.out.println("---------使用forEachOrdered可以保证顺序，但是有可能没法充分利用多核优势-----------");
        list.parallelStream().forEachOrdered(System.out::println);
        System.out.println("*********************获取cup核心数量**********************");
        System.out.println(
                "Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());


    }
}
