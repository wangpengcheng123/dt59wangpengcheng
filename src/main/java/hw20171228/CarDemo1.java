/**
 * Project Name:dt59wangpengcheng
 * File Name:CarDemo1.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午9:15:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午9:15:57 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public abstract class CarDemo1 {
    private String color;

    private String brand;

    public CarDemo1(String color, String brand) {

        this.color = color;
        this.brand = brand;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void summary();

    public abstract void run();

    public abstract void stop();

}
