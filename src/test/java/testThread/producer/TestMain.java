package testThread.producer;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 23:35
 * @Version 1.0
 **/
public class TestMain {
    public static void main(String[] args) {
        Warehouse house = new Warehouse();
        Producer p = new Producer(house);
        //设置优先级10更高
        p.setPriority(10);

        Consumer c1 = new Consumer(house);
        Consumer c2 = new Consumer(house);
        p.start();
        c1.start();
        c2.start();
    }
}
