package com.example.gl.rabbit.elseStudy.threadPoolExecutor;


import com.example.gl.rabbit.elseStudy.thread.MyThreadRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 */
public class MyThreadPoolExecutor{


    /**
     * 入参说明
     corePoolSize : 核心线程数线程数定义了最小可以同时运行的线程数量。
     maximumPoolSize : 当队列中存放的任务达到队列容量的时候，当前可以同时运行的线程数量变为
     最大线程数。
     workQueue: 当新任务来的时候会先判断当前运行的线程数量是否达到核心线程数，如果达到的话，
     信任就会被存放在队列中。
     keepAliveTime:当线程池中的线程数量大于 corePoolSize 的时候，如果这时没有新的任务提交，
     核心线程外的线程不会立即销毁，而是会等待，直到等待的时间超过了 keepAliveTime 才会被回收销毁；
     unit : keepAliveTime 参数的时间单位。
     threadFactory :executor 创建新线程的时候会用到。
     handler :饱和策略。
     */


    /**
     * ThreadPoolExecutor 饱和策略定义:
     如果当前同时运行的线程数量达到最大线程数量并且队列也已经被放满了任时，
     ThreadPoolTaskExecutor 定义一些策略: · ThreadPoolExecutor.AbortPolicy：抛出 RejectedExecutionException 来拒绝新任务的处理。
     · ThreadPoolExecutor.CallerRunsPolicy：调用执行自己的线程运行任务。您不会任务请求。但是
     这种策略会降低对于新任务提交速度，影响程序的整体性能。另外，这个策略喜欢增加队列容量。如果您
     的应用程序可以承受此延迟并且你不能任务丢弃任何一个任务请求的话，你可以选择这个策略。
     · ThreadPoolExecutor.DiscardPolicy： 不处理新任务，直接丢弃掉。
     · ThreadPoolExecutor.DiscardOldestPolicy： 此策略将丢弃最早的未处理的任务请求。
     */


    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
    //使用阿里巴巴推荐的创建线程池的方式
    //通过 ThreadPoolExecutor 构造函数自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
        //创建 WorkerThread 对象（WorkerThread 类实现了 Runnable 接口）
            Runnable worker = new MyRunnable("" + i);
        //执行 Runnable
            executor.execute(worker);
        }
        //终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
