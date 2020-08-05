package com.example.gl.rabbit.elseStudy.thread;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/7/22 Time: 10:51
 * \
 */
public class MyThread extends Thread{


    @Override
    public void run() {
        //重写run方法
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(2000);
                System.out.println("执行了"+i);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("i:  "+i);
        }
    }
    public static void main(String[] args) {
        new MyThread().run();
        System.out.println("执行了");
        new MyThread().start();
        System.out.println("跳过了了");
    }



    /**
     * 这说明一下run()方法和start()方法的区别
     *
     * run()
     *      Runnable接口中的抽象方法，而Thread实现了Runnable接口，需要重写run()方法
     *      而在Thread类重写的run()方法的源码中，只是调用了Runnable接口的run()方法
     *      如果直接调用run方法，并不会启动新线程，程序中只有当前线程线程，
     *      程序还是顺序执行，等待run方法体执行完毕后才可继续执行下面的代码，没有达到多线程的目的
     * start()方法
     *      启动新线程，处于就绪(可运行)状态，并没有运行，一旦得到cpu时间片，
     *      就开始执行相应线程的run()方法，这里run()称为线程体，它包含了要执行的这个线程的内容，
     *      run()方法运行结束，此线程随即终止。
     *      start()无需等待run()执行完毕，即可继续执行下面的代码，进行了线程切换
     *
     */
}
