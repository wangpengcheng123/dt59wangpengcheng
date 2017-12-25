/**
 * Project Name:dt59wangpengcheng
 * File Name:CardDemo.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:19:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * 
 * Description: <br/>
 * Date: 2017年12月25日 下午5:19:46 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class CardDemo {

    static String[] arr = new String[] { "至尊级", "钻石级", "铂金级", "黄金级", "白银级" };

    public static int moneyTest(String[] arr, Double money, String string) {
        double index = 0.75;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(string)) {
                sum = sum + money * index;
            }
            index = index + 0.05;
        }
        return (int) sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("至尊级会员打7.5折");
        System.out.println("钻石级会员打8折");
        System.out.println("铂金级会员打8.5折");
        System.out.println("黄金级会员打9折");
        System.out.println("白银级会员打9.5折");
        System.out.println("--------------------------------------------");
        System.out.println("请输入会员等级");
        String str1 = scanner.next();
        System.out.println("请输入购物金额：");
        Double money = scanner.nextDouble();
        System.out.println("该次购物所花的钱数是：" + moneyTest(arr, money, str1) + "元");
        scanner.close();

    }

}
