/**
 * Project Name:dt59wangpengcheng
 * File Name:PersonDemo4.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午11:34:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午11:34:39 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public abstract class PersonDemo4 {
    private String name;

    private String gender;

    private int age;

    private String vocation;

    public PersonDemo4(String name, String gender, int age, String vocation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vocation = vocation;

    }

    public abstract void sleep();

    public abstract void works();

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getVocation() {
        return vocation;
    }

}
