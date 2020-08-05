package com.example.gl.rabbit.elseStudy.thread.aqs;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/7/26 Time: 9:39
 * \
 */
public class CyclicBarrierBase {
    public static void threadTest() {
        new Thread(){
            @Override
            public void run() {
                String name2 = Thread.currentThread().getName();
                System.out.println(name2+":你好啊 我是一个线程!");
            }
        }.start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            threadTest();
        }
    }
}
