/**
 * Project Name:dt59wangpengcheng
 * File Name:MaxDemo.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:11:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:11:34 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class MaxDemo {
    public static int MaxTest(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字");
        int num = scanner.nextInt();
        System.out.println("请输入数字");
        int num2 = scanner.nextInt();
        System.out.println("两个数字的最大值是：" + MaxTest(num, num2));
        scanner.close();
    }

}
