/**
 * Project Name:dt59wangpengcheng
 * File Name:Person.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:04:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:04:51 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public abstract class StudentDemo {
    private String name;

    private int age;

    private String gender;

    public StudentDemo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        // Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public abstract void study();
}
