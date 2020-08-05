package com.example.gl.rabbit.elseStudy.thread;


public class MyThreadRunnable implements Runnable{


    @Override
    public void run() {
        //重写run方法
        for (int i = 0; i < 5; i++) {
            System.out.println("i:  "+i);
        }
    }
    public static void main(String[] args) {
        //创建Runnable的实例
        MyThread myThread = new MyThread();
        //该实例作为Thread的target，创建后这个thread对象才是真正的线程对象
        Thread thread = new Thread(myThread);
        thread.start();
    }

}
