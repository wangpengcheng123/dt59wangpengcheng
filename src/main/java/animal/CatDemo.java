/**
 * Project Name:dt59wangpengcheng
 * File Name:CatDemo.java
 * Package Name:animal
 * Date:2017年12月24日下午1:29:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package animal;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午1:29:32 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
abstract class Cat {// 将猫的基本方法抽取出来，不同的猫继承cat,就复写cat中的方法，定义不同的方法体
    abstract void sleep();

    abstract void eat();

    abstract void catchMouse();
}

class FeiFaException extends Exception {// 自定义异常
    public FeiFaException(String message) {
        super(message);
    }
}

class CatTest {
    private String name;

    private int age;

    private String color;

    public CatTest(String name, int age, String color) throws FeiFaException {
        if ((age < 0 && age > 10) || "蓝色".equals(color))
            throw new FeiFaException("出现非法值");
        this.age = age;
        this.name = name;
        this.color = color;

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

    public void method() {
        Cat cat = new Cat() {// 建立cat的子类的对象，复写里面的方法

            @Override
            void sleep() {
                System.out.println(name + "喜欢睡觉");

            }

            @Override
            void eat() {
                System.out.println(name + "喜欢吃小鱼");

            }

            @Override
            void catchMouse() {
                System.out.println(name + "喜欢捉老鼠");
            }

        };
        cat.sleep();
        cat.eat();
        cat.catchMouse();

    }
}

public class CatDemo {
    public static void main(String[] args) {
        try {
            CatTest catTest = new CatTest("小黄", 3, "黄色");
            System.out.println("姓名：" + catTest.getName() + "\t" + "年龄：" + catTest.getAge() + "岁" + "\t" + "颜色是："
                    + catTest.getColor());
            catTest.method();
        } catch (FeiFaException e) {
            System.out.println(e.toString());
        }
    }

}
