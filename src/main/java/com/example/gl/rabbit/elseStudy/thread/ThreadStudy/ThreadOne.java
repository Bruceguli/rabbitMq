package com.example.gl.rabbit.elseStudy.thread.ThreadStudy;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/8/24 Time: 21:45
 * \
 */
public class ThreadOne {


    //创建一个线程并运行
    public static void main(String[] args) {

        new Thread(()->{
            while(true){
                System.out.println("线程已经运行");
            }
        },"这里是线程名字").start();

    }


}
