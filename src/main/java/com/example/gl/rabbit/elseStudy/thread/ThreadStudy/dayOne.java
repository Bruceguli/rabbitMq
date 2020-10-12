package com.example.gl.rabbit.elseStudy.thread.ThreadStudy;



public class dayOne {

    public static void main(String[] args) {

        //防止服务器空转
        while(true){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.getMessage();
            }

        }
    }



    //可以用wait或者条件变量达到类似的效果
    //不同的是,后两种都需要加锁,并且需要唤醒操作,一版适用用要进行同步场景
    //sleep适用与无序同步的场景

}