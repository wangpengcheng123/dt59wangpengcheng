/**
 * Project Name:dt59wangpengcheng
 * File Name:ListDemo2.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:25:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;
/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午3:25:32 <br/>
 * @author   pengchengwang
 * @version
 * @see
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import snippet.Snippet;

public class ListDemo2 {
    private final static Logger LOG = Logger.getLogger(Snippet.class);

    private LinkedList<Object> linkedList;

    public ListDemo2() {
        linkedList = new LinkedList<>();
    }

    public Object listAdd2(Object obj) {
        return linkedList.add(obj);

    }

    public void listAdd3(Object obj) {
        linkedList.addFirst(obj);
    }

    public void listAdd4(Object obj) {
        linkedList.addLast(obj);
    }

    public Object listRemove2(Object obj) {
        return linkedList.remove(obj);
    }

    public void listRemove3() {
        linkedList.removeFirst();
    }

    public void listRemove4() {
        linkedList.removeLast();

    }

    public Object listGet2(int index) {
        return linkedList.get(index);

    }

    public Object listSet2(int index, Object element) {
        return linkedList.set(index, element);
    }

    public List<Object> get() {
        return linkedList;
    }

    public static void main(String[] args) {
        ListDemo2 listDemo2 = new ListDemo2();
        for (int i = 0; i < 3; i++) {
            listDemo2.listAdd3("小明" + i);// 反向添加数据
        }
        LOG.info(listDemo2.get());
        for (int i = 0; i < 4; i++) {
            listDemo2.listAdd4("小东" + i);// 正向添加数据
        }
        LOG.info(listDemo2.get());
        listDemo2.listRemove3();// 删除头
        LOG.info(listDemo2.get());
        listDemo2.listRemove4();// 删除最后面
        LOG.info(listDemo2.get());

        Iterator<Object> iterator = listDemo2.get().iterator();
        while (iterator.hasNext()) {
            LOG.info(iterator.next());
        }
    }

}
