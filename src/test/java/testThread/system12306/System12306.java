package testThread.system12306;

import java.util.Vector;

/**
 * @ClassName System12306
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 22:08
 * @Version 1.0
 **/

public class System12306 {
    //12306系统唯一的，设计为单例模式
    public System12306() {
    }

    private static System12306 system12306 = new System12306();

    public static System12306 getInstance() {
        if (system12306 == null) {
            return new System12306();
        } else {
            return system12306;
        }
    }

    private Vector<Ticket> tickets = new Vector<>();

    {
        for (int i = 10; i < 100; i++) {
            tickets.add(new Ticket("北京" + i, "深圳" + i, 998.88F));
        }
    }

    //设计一个方法从集合内获取一张火车票
    public Ticket getTicket() {
        try {
            return tickets.remove(0);
        } catch (Exception e) {
            return null;
        }
    }
}
