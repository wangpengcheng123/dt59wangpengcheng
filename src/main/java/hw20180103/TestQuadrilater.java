/**
 * Project Name:dt59wangpengcheng
 * File Name:TestQuadrilater.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:21:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

import snippet.Snippet;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:21:25 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class TestQuadrilater {
    private final static Logger Log = Logger.getLogger(Snippet.class);

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Rectangle(4, 3, 2);
        Quadrilateral quadrilateral2 = new Square(4, 4);
        RectangleInterface rectangleInterface = new Rectangle(4, 3, 2);
        Log.info("长方形面积是:" + quadrilateral.area());
        Log.info("正方形面积是:" + quadrilateral2.area());
        Log.info("长方形体积是:" + rectangleInterface.volume());

    }
}