package testThread;

/**
 * @ClassName RunningMan
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 21:43
 * @Version 1.0
 **/
public class RunningMan extends Thread {
    private String name;
    public RunningMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.name + "跑到多" + i + "少米");
        }
    }
}
