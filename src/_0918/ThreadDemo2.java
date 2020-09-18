package _0918;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-18
 * Time:20:43
 **/
public class ThreadDemo2 {
    private static long count = 100_000_0000L;
    public static void main(String[] args) {
        serial();
        concurrency();
    }

    private static void concurrency() {
        long beg = System.currentTimeMillis();
        //匿名内部类，仅知道这个类继承于Thread
        Thread t1 = new Thread(){
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }
        };
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("并行time: "+ (end-beg) +" ms");
    }

    private static void serial() {
        long beg = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("串行time: "+ (end-beg) +" ms");
    }
}
