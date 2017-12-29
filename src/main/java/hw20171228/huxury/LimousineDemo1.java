/**
 * Project Name:dt59wangpengcheng
 * File Name:LimousineDemo1.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月28日下午10:44:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.CarDemo1;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午10:44:12 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class LimousineDemo1 extends CarDemo1 {
    private String sedanNumber;

    private int personNumber;

    public LimousineDemo1(String color, String brand, String sedanNumber, int personNumber) {

        super(color, brand);
        this.sedanNumber = sedanNumber;
        this.personNumber = personNumber;

    }

    @Override
    public void summary() {

        System.out.println("我是豪车" + getBrand() + "，我的车身的演的是" + getColor() + "，我的车牌好是" + sedanNumber + "，我的车身空间不是很大，只能允许"
                + personNumber + "人乘坐");

    }

    @Override
    public void run() {

        System.out.println(getBrand() + "\trun");

    }

    @Override
    public void stop() {
        System.out.println(getBrand() + "\tstop");
        // Auto-generated method stub

    }

}
