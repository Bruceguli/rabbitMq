package com.example.gl.rabbit.elseStudy.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/7/26 Time: 9:45
 * \
 */
public class MyLock implements Lock {


    /**
     * 获取锁接口
     */
    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

   /**
    * 只有在执行时锁是空闲的才获取锁
    *
    * 如果锁是可以获取的，马上返回true；如果锁不允许获取，马上返回false；
    *
    * 该方法经典使用习惯
    * Lock lock = ...;
    * if (lock.tryLock()) {
    *   try {
    *     // manipulate protected state
    *   } finally {
    *     lock.unlock();
    *   }
    * } else {
    *   // perform alternative actions
    * }}
    *
    * 该用法确保在获取锁以后释放锁，并且不会在锁不可获取的时候去释放锁
    *
    * @return  true 如果锁是可以获取，否则返回false
    */
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    /**
     * 返回一个Condition对象绑定到本Lock对象
     *
     * 在等待condition对象返回前，锁必须由当前对象持有
     * 一个Condition#await()调用会自动释当前线程获取的锁，wait会在等待和重新获取锁之前返回
     *
     * 实现注意事项：
     * 要具体操作Condition对象依赖于Lock实现，并且在实现中要写明
     *
     *
     * @return A new {@link Condition} instance for this {@code Lock} instance
     * @throws UnsupportedOperationException if this {@code Lock}
     *         implementation does not support conditions
     */
    @Override
    public Condition newCondition() {
        return null;
    }

    //上面部分是实现的方法


}
