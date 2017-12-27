/**
 * Project Name:dt59wangpengcheng
 * File Name:StaticDemo6.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:05:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:05:07 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */

class Demo {
    static String name = "汪鹏程";

    int age = 21;

    public static void show1() {
        System.out.println("show1");

    }

    public void show2() {
        System.out.println("show2");

    }
}

public class StaticDemo6 {

    public static void main(String[] args) {
        System.out.println(new Demo().name);// 在静态方法中调用外部类成员变量，可以用该成员所属的类.成员名进行调用
        System.out.println(Demo.name);// 还可以建立该类所属的对象，用对象.成员变量名进行调用
        System.out.println(new Demo().age);// 对于非静态的成员变量，只能用对象.成员变量名进行调用
        new Demo().show1();// 在类中静态方法可以同过类名.方法名进行调用

        Demo.show1();// 还可以用类名.方法名进行调用
        new Demo().show2();// 在不同类中非静态方法只能通过对象.方法名进行调用
    }
}
