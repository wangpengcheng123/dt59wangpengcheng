/**
 * Project Name:dt59wangpengcheng
 * File Name:StudentDemo4.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午11:39:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午11:39:53 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class StudentDemo4 extends PersonDemo4 {
    /**
     * 创建构造方法并且调用父类的构造函数进行数据的初始化，因为父类已经跟我们将我们需要的成员初始化好了，所以直接调用就行<br/>
     * Creates a new instance of StudentDemo4.
     *
     * @param name
     * @param gender
     * @param age
     * @param vocation
     */

    public StudentDemo4(String name, String gender, int age, String vocation) {

        super(name, gender, age, vocation);

    }

    /**
     * 重写(覆盖)父类的抽象方法,若是有抽象方法没有复写，那么此时子类也是一个抽象类,不能实例化变量<br/>
     *
     * @see hw20171228.PersonDemo4#sleep()
     */
    @Override
    public void sleep() {

        System.out.println(getName() + "喜欢sleep");

    }

    @Override
    public void works() {
        System.out.println(getName() + "需要学习");
        // Auto-generated method stub

    }

    public void show() {
        System.out.println("姓名:" + getName() + "\t" + "   " + "性别:" + getGender() + "\t" + "年龄:" + getAge() + "\t"
                + "职业:" + getVocation());
    }

    /**
     * 多态：<br/>
     * 好处：大大的提高了程序的扩展 性 <br/>
     * 弊端：只能使用父类的引用访问父类中的成员 <br/>
     * 创建父类的引用调用被子类复写的方法，利用向上转型<br/>
     * 再利用向下转型调用子类独属的对象<br/>
     * Description: <br/>
     *
     * @author pengchengwang
     * @param args
     */
    public static void main(String[] args) {
        PersonDemo4 p = new StudentDemo4("汪鹏程", "男", 21, "学生");
        p.sleep();
        p.works();
        ((StudentDemo4) p).show();
    }

}
