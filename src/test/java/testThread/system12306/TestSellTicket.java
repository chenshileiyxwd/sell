package testThread.system12306;

/**
 * @ClassName TestSellTicket
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 22:33
 * @Version 1.0
 **/
public class TestSellTicket {
    public static void main(String[] args) {
        Window window1 = new Window("深圳北站");
        Window window2 = new Window("广州南站");
        Window window3 = new Window("北京站");
        window1.start();
        window2.start();
        window3.start();
    }
}
