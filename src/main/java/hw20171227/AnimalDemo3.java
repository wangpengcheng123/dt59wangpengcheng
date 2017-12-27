/**
 * Project Name:dt59wangpengcheng
 * File Name:AnimalDemo.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:25:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:25:12 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class AnimalTest {
    private String name;

    private int age;

    private String color;

    public AnimalTest(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        // Auto-generated constructor stub

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

}

public class AnimalDemo3 {

    public static void main(String[] args) {
        AnimalTest a = new AnimalTest("小黄", 2, "黄色");
        System.out.println(a.getName() + "是一只颜色为" + a.getColor() + "的小狗," + "它今年" + a.getAge() + "岁了，");
    }

}
