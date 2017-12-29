/**
 * Project Name:dt59wangpengcheng
 * File Name:TruckDemo1.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午9:45:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午9:45:44 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class TruckDemo1 extends CarDemo1 {

    private String sedanNumber;

    private int personNumber;

    public TruckDemo1(String color, String brand, String sedanNumber, int personNumber) {

        super(color, brand);
        this.sedanNumber = sedanNumber;
        this.personNumber = personNumber;
    }

    @Override
    public void summary() {

        System.out.println(
                "这是一辆" + getBrand() + ",它的颜色是" + getColor() + ",车牌号是" + sedanNumber + ",能坐" + personNumber + "人。");

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

    public void moderate() {
        System.out.println(getBrand() + "\tmoderate");
    }

}
