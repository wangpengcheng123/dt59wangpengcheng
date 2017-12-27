/**
 * Project Name:dt59wangpengcheng
 * File Name:TestTypeDefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:05:20
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:05:20 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class TypeDefaultValue {
    private byte b;

    private short s;

    private int i;

    private long l;

    private float f;

    private double d;

    private boolean bl;

    private char c;

    private String string;

    private int[] arr;

    public byte getB() {
        return b;
    }

    public short getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    public long getL() {
        return l;
    }

    public float getF() {
        return f;
    }

    public double getD() {
        return d;
    }

    public boolean isBl() {
        return bl;
    }

    public char getC() {
        return c;
    }

    public String getString() {
        return string;
    }

    public int[] getArr() {
        return arr;
    }

}

public class TestTypeDefaultValue1 {
    public static void main(String[] args) {
        System.out.println("byte类型的默认值是:" + new TypeDefaultValue().getB());
        System.out.println("short类型的默认值是:" + new TypeDefaultValue().getS());
        System.out.println("int类型的默认值是:" + new TypeDefaultValue().getI());
        System.out.println("long类型的默认值是:" + new TypeDefaultValue().getL());
        System.out.println("double类型的默认值是:" + new TypeDefaultValue().getD());
        System.out.println("float类型的默认值是:" + new TypeDefaultValue().getF());
        System.out.println("boolean类型的默认值是:" + new TypeDefaultValue().isBl());
        System.out.println("char类型的默认值是:" + new TypeDefaultValue().getC());
        System.out.println("string类型的默认值是:" + new TypeDefaultValue().getString());
        System.out.println("int[]类型的默认值是:" + new TypeDefaultValue().getArr());
    }
}
