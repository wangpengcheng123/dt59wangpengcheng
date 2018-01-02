/**
 * Project Name:dt59wangpengcheng
 * File Name:TestStudentDemo.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:15:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:15:16 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class TestStudentDemo {

    public static void main(String[] args) {
        StudentDemo studentDemo = new BaseStudent("张三", 21, "男");
        StudentDemo studentDemo1 = new SeniorStudent("李四", 21, "男");
        studentDemo.study();
        studentDemo1.study();
        BaseStudent baseStudent = new BaseStudent("王五", 21, "男");
        SeniorStudent seniorStudent = new SeniorStudent("小花", 20, "女");
        baseStudent.set1(baseStudent);
        seniorStudent.set(seniorStudent);
        baseStudent.getStudentDemo().study();
        seniorStudent.getStudentDemo().study();
    }
}
