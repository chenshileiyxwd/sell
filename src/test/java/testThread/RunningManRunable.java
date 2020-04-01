package testThread;

/**
 * @ClassName RunningManRunable
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 21:56
 * @Version 1.0
 **/
public class RunningManRunable implements Runnable {
    private String name;

    public RunningManRunable(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            StringBuffer stringBuffer = new StringBuffer();
            System.out.println(this.name + "跑了" + i + "米");
        }
    }
}
