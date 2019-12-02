package testThread.producer;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 23:18
 * @Version 1.0
 **/
public class Consumer extends Thread {
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    //一直从仓库内获取元素
    @Override
    public void run() {
        while (true) {
            warehouse.get();
            System.out.println("消费者拿走了一件商品");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
