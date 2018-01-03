/**
 * Project Name:dt59wangpengcheng
 * File Name:Square.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:18:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:18:58 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class Square extends Quadrilateral {

    public Square(int length, int width) {

        super(length, width);
        // Auto-generated constructor stub

    }

    @Override
    public int area() {

        return (super.getLength() * super.getWidth());
    }

}
