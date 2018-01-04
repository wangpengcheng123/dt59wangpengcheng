/**
 * Project Name:dt59wangpengcheng
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午1:44:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;
/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午1:44:03 <br/>
 * @author   pengchengwang
 * @version
 * @see
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import snippet.Snippet;

public class ListDemo {
    private final static Logger LOG = Logger.getLogger(Snippet.class);

    private List<Object> arrayList;

    public ListDemo() {

        arrayList = new ArrayList<Object>();

    }

    public Object listAdd(Object obj) {
        return arrayList.add(obj);

    }

    public Object listRemove(Object obj) {
        return arrayList.remove(obj);
    }

    public Object listGet(int index) {
        return arrayList.get(index);

    }

    public Object listSet(int index, Object element) {
        return arrayList.set(index, element);
    }

    public List<Object> get() {
        return arrayList;
    }

    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        for (int i = 0; i < 10; i++) {
            listDemo.listAdd("汪鹏程" + i);
        }
        listDemo.listRemove("汪鹏程3");// 删除元素
        LOG.info(listDemo.get());
        LOG.info("获取容器中索引为3的元素：" + listDemo.listGet(3));
        listDemo.listSet(2, "12321");// 将容器中索引为2的元素替换为12321

        LOG.info(listDemo.get());
        Iterator<Object> iterator = listDemo.get().iterator();
        while (iterator.hasNext()) {
            LOG.info(iterator.next());
        }

    }

}
