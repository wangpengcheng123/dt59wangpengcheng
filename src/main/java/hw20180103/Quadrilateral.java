/**
 * Project Name:dt59wangpengcheng
 * File Name:Quadrilateral.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:07:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:07:07 <br/>
 * @author   pengchengwang
 * @version
 * @see
 */

public abstract class Quadrilateral {
    private int length;

    private int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public abstract int area();

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
