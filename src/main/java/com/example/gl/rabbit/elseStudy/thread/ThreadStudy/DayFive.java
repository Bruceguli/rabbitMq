package com.example.gl.rabbit.elseStudy.thread.ThreadStudy;

//3-27  28 两阶段终止模式:就是在一个线程t1优雅的终止t2,优雅是指给t2一个准备时间的机会

//stop方法会真正杀死线程,如果这些线程锁住了共享资源,有被杀死,就没有机会再释放
//现线程的整个java程序进程停止


//使用场景系统的健康状态记录
public class DayFive {

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



    //两阶段终止模式使用场景系统的健康状态记录
    class TwophaseTermination{
        private Thread monitor;


        public void start(){
            monitor= new Thread(()->{
                while(true){
                    Thread currentThread = Thread.currentThread();
                    if(currentThread.isInterrupted()){
                        //被标记了
                        break;
                    }
                    //没有被打断就是要实行监控
                    try{
                        Thread.sleep(1000);//情况1
                        System.out.println("执行监控");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        //重新赋值打断标记
                        currentThread.interrupt();
                    }

                }
            });

        }
        public void stop(){
            monitor.interrupt();
        }

    }
}
