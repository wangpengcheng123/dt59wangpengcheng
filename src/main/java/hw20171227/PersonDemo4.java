/**
 * Project Name:dt59wangpengcheng
 * File Name:PersonDemo4.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:33:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:33:43 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class PersonTest {
    private String name;

    private int age;

    private char gender;

    public PersonTest(String name) {
        this.name = name;
    }

    public PersonTest(String name, int age) {
        this(name);
        this.age = age;
    }

    public PersonTest(String name, int age, String gender) {

        this(name, age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null)
            this.gender = gender.charAt(0);
    }
}

/**
 * 
 * Description: <br/>
 * 每new一下就创建了一个对象，每个对象中都有name\age\gender随着创建对象向构造函数中传值，有些对象只传一个或者两个值<br/>
 * 那么剩下的没有初始化的成员变量的值就是系统给的默认值，所以打印出的结果有的有值，有的为0或空<br/>
 * date: 2017年12月27日 下午2:27:48 <br/>
 *
 * @author pengchengwang
 * @version
 */
public class PersonDemo4 {

    public static void main(String[] args) {
        PersonTest p1 = new PersonTest("汪鹏程");
        PersonTest p2 = new PersonTest("汪鹏程", 21);
        PersonTest p3 = new PersonTest("汪鹏程", 21, "男性");
        System.out.println(p1.getName() + "\t" + p1.getAge() + "\t" + p1.getGender());
        System.out.println(p2.getName() + "\t" + p2.getAge() + "\t" + p2.getGender());
        System.out.println(p3.getName() + "\t" + p3.getAge() + "\t" + p3.getGender());

    }
}
