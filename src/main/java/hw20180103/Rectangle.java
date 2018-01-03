/**
 * Project Name:dt59wangpengcheng
 * File Name:Rectangle.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:12:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:12:07 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class Rectangle extends Quadrilateral implements RectangleInterface {
    private int height;

    public Rectangle(int length, int width, int height) {

        super(length, width);
        // Auto-generated constructor stub
        this.height = height;

    }

    @Override
    public int area() {

        // Auto-generated method stub
        return (super.getLength() * super.getWidth());
    }

    @Override
    public int volume() {

        return (super.getLength() * super.getWidth() * height);
    }

}
