/**
 * Project Name:dt59wangpengcheng
 * File Name:NumDemo.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:31:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

import snippet.Snippet;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:31:20 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class NullDemo {
    private String name;

    private String gender;

    private int age;

    private final static Logger Log = Logger.getLogger(Snippet.class);

    public NullDemo() {
    }

    public NullDemo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public NullDemo method(NullDemo demo) {
        return demo;

    }

    public void method_2(NullDemo[] arr) {

        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                break;
            }
            arr[i] = new NullDemo().method(new NullDemo("汪鹏程" + i, "男" + i, 19 + i));

        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        NullDemo[] arr = new NullDemo[4];
        NullDemo numDemo = new NullDemo();
        numDemo.method_2(arr);
        Log.info(arr[0].getName() + "\t" + arr[0].getGender() + "\t" + arr[0].getAge());
        Log.info(arr[1].getName() + "\t" + arr[1].getGender() + "\t" + arr[1].getAge());
        Log.info(arr[2].getName() + "\t" + arr[2].getGender() + "\t" + arr[2].getAge());
        try {
            Log.info(arr[3].getName() + "\t" + arr[3].getGender() + "\t" + arr[3].getAge());
        } catch (Exception e) {

            Log.info(e.toString());
        }

    }
}
