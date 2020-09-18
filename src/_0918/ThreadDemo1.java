package _0918;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-18
 * Time:20:19
 **/
public class ThreadDemo1 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("HelloWorld,我是一个线程");

        }
    }
    public static void main1(String[] args) {
        //创建线程需要用Thread来创建Thread的一个实例
        //方法1：直接集成Thread类,重写run()方法
        //当创建出Thread这个类的对象时，内核中并没有产生一个PCB（线程）
        Thread t = new MyThread();
        //执行t.star()时才会产生一个线程
        //当调用t.star()时，会产生一个对应的PCB去执行对应run()方法中的代码
        t.start();

    }
}
