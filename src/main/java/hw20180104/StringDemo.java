/**
 * Project Name:dt59wangpengcheng
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午1:29:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

import snippet.Snippet;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午1:29:55 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(Snippet.class);

    public static void main(String[] args) {
        String string = "abcadefaghi";
        LOG.info("字符串的长度：" + string.length());

        LOG.info("在字符串中索引值为3的值：" + string.charAt(3));
        LOG.info("a在字符串中的索引值：" + string.indexOf('a'));
        LOG.info("截取出字符串中包含1索引不包含4索引的值：" + string.substring(1, 4));
        LOG.info("从索引3开始找对应的h第一次出现的位置：" + string.indexOf("h", 3));
        LOG.info("将字符串变为大写：" + string.toUpperCase());
        LOG.info("从字符串的最后开始索引找出b第一次出现的索引值：" + string.lastIndexOf("b"));
        LOG.info("判断字符串是否是以i结尾的：" + string.endsWith("i"));
        LOG.info("判断字符串是否是以a开头的：" + string.startsWith("a"));
        LOG.info("比较两个字符串的大小：" + string.compareTo("c"));
        LOG.info("判断字符串是否为空：" + string.isEmpty());

    }

}
