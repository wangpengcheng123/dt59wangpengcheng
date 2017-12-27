/**
 * Project Name:dt59wangpengcheng
 * File Name:Construction.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:18:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:18:47 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class ConstructionPerson2 {
    private String name = "汪鹏程";

    private int age = 21;

    private char gender = '男';

    public ConstructionPerson2() {
        System.out.println("姓名是:" + name);
        System.out.println("年龄是:" + age);
        System.out.println("性别是:" + gender);

        name = "wangpengcheng";
        age = 20;
        gender = '男';
        // Auto-generated constructor stub
        System.out.println("姓名是:" + name);
        System.out.println("年龄是:" + age);
        System.out.println("性别是:" + gender);

    }

    public static void main(String[] args) {
        new ConstructionPerson2();
    }

}
