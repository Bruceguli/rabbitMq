package com.example.gl.rabbit.elseStudy.thread.ThreadStudy;


//3-22
public class DayTwo {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException{

        //demo();
        demo1();
    }

    private static void demo() throws InterruptedException{
        System.out.println("开始");
        Thread t =new Thread(()->{
            System.out.println("线程开始");
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.getMessage();
            }
            System.out.println("睡眠结束");
            count=100;
        },"t1");
        t.start();
        System.out.println(count);
    }
    //说明
    //输出结果是0.因为主线程和线程t1是并行执行的,t1要一秒以后才能赋值,主线程在线程t1没有赋值count的时候就要输出
    //我想等线程t1运行结束在输出,引出join的作用,谁调用join,就是等待那个线程


    //所以

    private static void demo1() throws InterruptedException{
        System.out.println("开始");
        Thread t =new Thread(()->{
            System.out.println("线程开始");
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.getMessage();
            }
            System.out.println("睡眠结束");
            count=100;
        },"t1");
        t.start();
        t.join();
        System.out.println(count);
    }
}
