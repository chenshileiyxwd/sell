package testThread.producer;

/**
 * @ClassName Producer
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 23:18
 * @Version 1.0
 **/
public class Producer extends Thread {
    //为了保证生产者和消费者使用同一个仓库对象，添加一个属性
    private Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    //生产者一直向仓库内增加元素
    @Override
    public void run() {
        while (true) {
            warehouse.add();
            System.out.println("生产者存入了一件商品");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
