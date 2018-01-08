/**
 * Project Name:dt59wangpengcheng
 * File Name:ThreadDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日上午10:16:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:16:36 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class ThreadDemo extends Thread {
    private static final Logger LOG = Logger.getLogger(ThreadDemo.class);

    private String name;

    private int age;

    private String message = "默认优先级线程";

    public ThreadDemo(String name, int age) {

        this.age = age;
        this.name = name;

    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        LOG.info(Thread.currentThread().getName() + message + "\t" + "姓名:" + name + "\t" + "年龄:" + age);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadDemo threadDemo = new ThreadDemo("汪鹏程" + i, 15 + i);

            if (i > 0 && i % 3 == 0) {
                threadDemo.setMessage("优先级最高线程");
                threadDemo.setPriority(Thread.MAX_PRIORITY);
            }
            if (i == 0) {
                threadDemo.setMessage("优先级最低线程");
                threadDemo.setPriority(Thread.MIN_PRIORITY);
            }
            threadDemo.start();
        }

    }

}
