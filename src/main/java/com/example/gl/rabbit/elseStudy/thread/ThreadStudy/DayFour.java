package com.example.gl.rabbit.elseStudy.thread.ThreadStudy;

//3-25
//有关interrupt打断线程,一类是阻塞状态的线程,任务调度器不会给时间片给阻塞线程,什么样的线程会是阻塞状态,调用了sleep  wait join方法
public class DayFour {

    public static void main(String[] args) throws InterruptedException{
        //demo();
        demoTwo();
    }

    private static void demo() throws InterruptedException{
        Thread t1 = new Thread(() -> {
            System.out.println("睡眠");
            try{
                Thread.sleep(5000);//wait 和 join打断标记是false
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        },"t1");
        t1.start();
        Thread.sleep(1000);
        System.out.println("打断");
        t1.interrupt();
        System.out.println("打断标记"+t1.isInterrupted());
    }



    //3-26 下面是打断正常运行的线程
    private static void demoTwo() throws InterruptedException{
        Thread t1 = new Thread(() ->{
            while(true){
                //根据打断标记来判断.下面的内容不加程序会一直进行
                boolean interrupted = Thread.currentThread().isInterrupted();
                if(interrupted){
                    break;
                }

            }
        });
        t1.start();
        Thread.sleep(1000);
        System.out.println("打断");
        t1.interrupt();
        System.out.println(t1.interrupted());

    }
}
