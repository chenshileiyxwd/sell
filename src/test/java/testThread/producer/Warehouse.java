package testThread.producer;

import java.util.ArrayList;

/**
 * @ClassName Warehouse
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 23:19
 * @Version 1.0
 **/
public class Warehouse {
    private ArrayList<String> list = new ArrayList<>();

    public void add() {
        if (list.size() < 20) {
            list.add("a");
        } else {
            try {
                //注意：虽然是仓库对象house调用了wait方法，但是不是仓库对象等待，
                // 而是访问仓库的生产者线程进入等待状态。
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //方式一：对get方法进行同步锁
    public synchronized void get() {
        if (list.size() > 0) {
            list.remove(0);
        } else {
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}