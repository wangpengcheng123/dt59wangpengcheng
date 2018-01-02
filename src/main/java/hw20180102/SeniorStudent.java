/**
 * Project Name:dt59wangpengcheng
 * File Name:SeniorStudent.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:09:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:09:40 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class SeniorStudent extends StudentDemo {
    private StudentDemo studentDemo;

    public SeniorStudent(String name, int age, String gender) {

        super(name, age, gender);
        // Auto-generated constructor stub

    }

    @Override
    public void study() {

        System.out.println(super.getName() + "高级班学习框架");

    }

    public StudentDemo getStudentDemo() {
        return studentDemo;
    }

    public StudentDemo set(StudentDemo studentDemo) {
        if (studentDemo instanceof BaseStudent) {
            return this.studentDemo = studentDemo;
        } else if (studentDemo instanceof SeniorStudent) {
            return this.studentDemo = studentDemo;
        }
        return this.studentDemo = studentDemo;

    }
}