package com.example.gl.rabbit.elseStudy.thread;

import java.util.concurrent.*;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/7/21 Time: 23:12
 * \
 */
public class CallableDemo {

    public static void main(String[] args) {


        /**
         * corePoolSize:   线程池核心线程数量
         * maximumPoolSize:    线程池允许最大线程数量
         * keepAliveTime:  线程池中线程所允许的空闲时间
         * unit:   线程池维护线程所允许的空闲时间的单位
         */
        ThreadPoolExecutor  pool=
        new ThreadPoolExecutor (1,1,100,TimeUnit.MINUTES,new LinkedBlockingDeque<Runnable>(10));



        Callable<String> callable=new Callable<String>() {
            @Override
            public String call() throws Exception {

                System.out.println("线程开始执行。。。");
                return "this return";
            }
        };

        Future future=pool.submit(callable);
        try {
            System.out.println("线程执行完毕。。。");
            System.out.println(future.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

