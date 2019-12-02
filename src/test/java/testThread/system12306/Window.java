package testThread.system12306;

/**
 * @ClassName Window
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 22:08
 * @Version 1.0
 **/
public class Window extends Thread {

    private String windowName;

    public Window(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public void run() {
        sellTicket();
    }

    public void sellTicket() {
        while (true) {
            System12306 instance = System12306.getInstance();
            Ticket ticket = instance.getTicket();
            if (ticket == null) {
                System.out.println("当前窗口" + windowName + "车票已售完");
                break;
            }
            System.out.println("从" + windowName + "这个窗口售出一张车票\t" + ticket.toString());
        }
    }
}
