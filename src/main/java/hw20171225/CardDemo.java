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
    static String str1 = "至尊级";

    static String str2 = "钻石级";

    static String str3 = "铂金级";

    static String str4 = "黄金级";

    static String str5 = "白银级";

    static String[] arr = new String[] { str1, str2, str3, str4, str5 };

    public double moneyTest(String[] arr, double money, String string) {

        double index = 0.75;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(string)) {
                money = money * index;
            }
            index = index + 0.05;
        }
        return money;

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
        int money = scanner.nextInt();
        System.out.println("该次购物所花的钱数是：" + new CardDemo().moneyTest(arr, money, str1) + "元");
        scanner.close();

    }

}
