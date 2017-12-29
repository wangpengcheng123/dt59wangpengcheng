/**
 * Project Name:dt59wangpengcheng
 * File Name:TestCar1.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午9:40:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

import hw20171228.huxury.LimousineDemo1;

/**
 * 
 * Description: <br/>
 * Date: 2017年12月28日 下午9:40:03 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class Test {
    /**
     * 利用多态思想，向方法里面传入一个父类的 引用，在利用父类的引用调用父类中的函数<br/>
     * 当调用该函数时传入的是子类的对象时此时就构成了多态的向上转型，父类的引用调用的也变成了被子类复写的方法<br/>
     * 在通过instanceof判断传入的对象时属于哪个类的，在通过向下转型，调用子类中独有的成员<br/>
     * Description: <br/>
     *
     * @author pengchengwang
     * @param c
     */
    public void method(CarDemo1 c) {
        c.summary();
        c.run();
        c.stop();
        if (c instanceof SedanDemo1) {
            SedanDemo1 s = (SedanDemo1) c;
            s.quicken();
        }
        if (c instanceof TruckDemo1) {
            TruckDemo1 new_name = (TruckDemo1) c;
            new_name.moderate();

        }

    }

}

public class TestCar1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.method(new SedanDemo1("红色", "兰博基尼", "123456", 2));
        test.method(new TruckDemo1("蓝色", "卡车", "123456789", 8));
        test.method(new LimousineDemo1("黑色", "法拉利", "nb110", 2));

    }

}
