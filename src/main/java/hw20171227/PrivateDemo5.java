/**
 * Project Name:dt59wangpengcheng
 * File Name:PrivateDemo5.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:59:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:59:32 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class PrivateTest {
    private String name;

    private int age;

    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

public class PrivateDemo5 {

    public static void main(String[] args) {
        PrivateTest p = new PrivateTest();
        p.setName("汪鹏程");
        p.setAge(21);
        p.setGender('男');
        System.out.println("姓名：" + p.getName() + "        " + "年龄：" + p.getAge() + "     " + "性别：" + p.getGender());
    }
}
