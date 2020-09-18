package _0918;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-18
 * Time:21:14
 **/
public class ThreadDemo3 {
   /* static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("我是一个新线程");
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }*/
   public static void main(String[] args) {
      /* Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("我是一个新线程");
           }
       };
       Thread t = new Thread(runnable);
       t.start();*/
      Thread t = new Thread(() ->{
          System.out.println("我是一个新线程");
      }
      );
      t.start();
   }
}
