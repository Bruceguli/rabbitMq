package com.example.gl.rabbit.elseStudy.thread.aqs;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;


/**
 * CyclicBarrier(循环栅栏)： CyclicBarrier 和 CountDownLatch 非常类似，它也可以实现线程间
 的技术等待，但是它的功能比 CountDownLatch 更加复杂和强大。主要应用场景和 CountDownLatch 类
 似。
 CyclicBarrier 的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程
 到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，所有被屏障
 拦截的线程才会继续干活。CyclicBarrier 默认的构造方法是 CyclicBarrier(int parties)，其参数表示屏障拦
 截的线程数量，每个线程调用 await()方法告诉 CyclicBarrier 我已经到达了屏障，然后当前线程被阻塞。
 */
public class MyCyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier barrier=new CyclicBarrier(8);
        Thread[] play=new Thread[8];
        for (int i = 0; i < 8; i++) {
            play[i]=new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(new Random().nextInt(10));
                    System.out.println(Thread.currentThread().getName()+"准备好了");
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("选手"+Thread.currentThread().getName()+"起跑");
            },"plap["+i+"]");
            play[i].start();
        }
//        for (int i = 0; i < 8; i++) {
//            play[i]=new Thread(()->{
//                try {
//                    TimeUnit.SECONDS.sleep(new Random().nextInt(10));
//                    System.out.println(Thread.currentThread().getName()+"准备好了");
//                    barrier.await();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                System.out.println("选手"+Thread.currentThread().getName()+"起跑");
//            },"play["+i+"]");
//            play[i].start();
//        }
    }
}
