package testThread;

/**
 * @ClassName TestMainThread
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 21:46
 * @Version 1.0
 **/
public class TestMainThread {
    public static void main(String[] args) {
        String s = "aAcCzZ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("c = " + c);
            System.out.println("((int) c) = " + ((int) c));
        }
    }














    public static void main1(String[] args) throws InterruptedException {
        RunningMan runningMan1 = new RunningMan("陈世磊");
        RunningMan runningMan2 = new RunningMan("leehom");
        RunningMan runningMan3 = new RunningMan("JimGreen");
        runningMan1.start();
        runningMan2.start();
        runningMan3.start();
        Thread.sleep(20);
        System.out.println("主线程执行--------------over");
    }

    public static void main2(String[] args) {
        RunningManRunable r1 = new RunningManRunable("csl");
        RunningManRunable r2 = new RunningManRunable("leehom");
        RunningManRunable r3 = new RunningManRunable("Jim");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
