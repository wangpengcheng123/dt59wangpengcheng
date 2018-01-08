/**
 * Project Name:dt59wangpengcheng
 * File Name:RunnableDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日上午10:38:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:38:20 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class RunnableTest implements Runnable {
    public static final Logger LOG = Logger.getLogger(RunnableDemo.class);

    ReentrantLock lock = new ReentrantLock();// 创建一个实现lock接口的实例

    Condition condition = lock.newCondition();// 通过调用newcondition方法获取condition的子类对象

    int index = 1000;

    @Override
    public void run() {

        while (true) {
            // synchronized (this) {
            lock.lock();// 获取锁
            try {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    // Auto-generated catch block
                    e.printStackTrace();

                }
                if (index > 0) {
                    // 获取获取线程名称
                    LOG.info(Thread.currentThread().getName() + "\t" + "汪鹏程" + index--);
                }
                if (index == 0) {
                    break;
                    // }
                }
            } finally {
                lock.unlock();// 只能放在finally中
            }

        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        Thread thread1 = new Thread(runnableTest, "较大优先级线程");
        Thread thread2 = new Thread(runnableTest, "默认优先级线程");
        Thread thread3 = new Thread(runnableTest, "默认优先级线程");
        Thread thread4 = new Thread(runnableTest, "最低优先级线程");
        thread1.setPriority(8);
        thread4.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
