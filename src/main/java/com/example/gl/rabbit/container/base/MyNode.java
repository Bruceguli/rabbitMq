package com.example.gl.rabbit.container.base;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/9/7 Time: 21:50
 * \
 */

//是说说明什么是链表
public class MyNode {
    private Object object;
    private MyNode next;

    public MyNode(Object object, MyNode next) {
        this.object = object;
        this.next = next;
    }

    public static void main(String[] args) {
        MyNode header = new MyNode(new Object(),null);//头
        header.next= new MyNode(new Object(),null);
        //1.这边是第二个就和第一个头结点成为一个链表,第三个结点出现了,添加在链表的头更方便,入下代码,放入尾部只能去循环看那个是为节点比较慢
        new MyNode(new Object(),header);
        //2.已经知道了方头部那么它是如何get的呢?
        //首先根据hashcode值反推出在数组的第几个位置,其实它是每次每个位置成为链表以后,他会自动向下,主要是为了找到这个位置下面所有的对象(这个要理解一下)
        //具体实现的原理就是说,数组都是在堆中的,上述描述的enty对象应用存在堆中,下移的过程其实就是堆引用切换的过程
    }
}
