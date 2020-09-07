package com.example.gl.rabbit.container;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/9/7 Time: 21:18
 * \
 */
public class MyHashMap {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();//数据+链表
        //底层是封装成一个entity对象,放在数组中,一般在数字会有下标,但是hashmap的put方法是没有下标的,但是hashmap没有
        //如果是用的arrayList 由下标的方式去存为什么不行呢,get的效率会低  get后面是key 不是下标
        //实际是根据你存入的key,任何对象都有hashcode方法hashcode的值如下:
        System.out.println("6666".hashCode());
        //那这个code太大了不合适,它是用值取余数组长度,你会发现在很多值取余会有出现在同一位置这个时候就引出了链表的概念
        hashMap.put("aa","66");



//        ArrayList arrayList =new ArrayList();
//        arrayList.add(new Object());//0
//        arrayList.add(new Object());//1
    }




}
