/**
 * Project Name:dt59wangpengcheng
 * File Name:BaseStudent.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:09:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:09:15 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class BaseStudent extends StudentDemo {
    private StudentDemo studentDemo;

    public BaseStudent(String name, int age, String gender) {

        super(name, age, gender);
        // Auto-generated constructor stub

    }

    @Override
    public void study() {

        System.out.println(super.getName() + "基础班学习基础java知识");

    }

    public StudentDemo getStudentDemo() {
        return studentDemo;
    }

    public StudentDemo set1(StudentDemo studentDemo) {
        if (studentDemo instanceof BaseStudent) {
            return this.studentDemo = studentDemo;
        } else if (studentDemo instanceof SeniorStudent) {
            return this.studentDemo = studentDemo;
        }
        return this.studentDemo = studentDemo;

    }
}
