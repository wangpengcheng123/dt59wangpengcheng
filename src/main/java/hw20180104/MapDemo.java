/**
 * Project Name:dt59wangpengcheng
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:41:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import snippet.Snippet;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:41:52 <br/>
 * 
 * @author pengchengwang
 * @version
 * @see
 */
class StudentDemo {
    private int id;

    private String name;

    public StudentDemo(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class MapDemo {
    private final static Logger LOG = Logger.getLogger(Snippet.class);

    public static void main(String[] args) {
        StudentDemo studentDemo1 = new StudentDemo(0, "汪鹏程");
        StudentDemo studentDemo2 = new StudentDemo(4, "李林");
        StudentDemo studentDemo3 = new StudentDemo(2, "叶新童");
        StudentDemo studentDemo4 = new StudentDemo(5, "黄磊");
        StudentDemo studentDemo5 = new StudentDemo(3, "黄金");
        StudentDemo studentDemo6 = new StudentDemo(1, "吴珍");
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(studentDemo2.getId(), studentDemo2.getName());
        map.put(studentDemo4.getId(), studentDemo4.getName());
        map.put(studentDemo3.getId(), studentDemo3.getName());
        map.put(studentDemo1.getId(), studentDemo1.getName());
        map.put(studentDemo5.getId(), studentDemo5.getName());
        map.put(studentDemo6.getId(), studentDemo6.getName());
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer object = iterator.next();
            String string = map.get(object);
            LOG.info("(" + object + "," + string + ")");

        }
        System.out.println("------------------------------------");

        Map<Integer, String> map2 = new TreeMap<Integer, String>();
        map2.putAll(map);
        LOG.info("判断此映射不包含键-值映射关系：" + map2.isEmpty());
        LOG.info("映射关系个数：" + map2.size());

        Set<Integer> set1 = map2.keySet();
        Iterator<Integer> iterator1 = set1.iterator();

        while (iterator1.hasNext()) {

            Integer object1 = iterator1.next();
            String string1 = map.get(object1);
            LOG.info("(" + object1 + "," + string1 + ")");

        }

    }

}
