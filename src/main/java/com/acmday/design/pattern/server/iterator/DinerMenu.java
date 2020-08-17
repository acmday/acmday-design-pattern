package com.acmday.design.pattern.server.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class DinerMenu {
    private int numberOfItems;
    private int MAX_ITEMS;
    private MenuItem[] menuItems;

    public DinerMenu(MenuItem[] items){
        this.menuItems = items;
        this.MAX_ITEMS = items.length;
        this.numberOfItems = 0;
    }

    public boolean addItem(MenuItem item){
        if(numberOfItems >= MAX_ITEMS){
            try {
                throw new Exception("加入失败");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        menuItems[numberOfItems++] = item;
        return true;
    }

    private void add(){
        //可以看看ArrayList是怎么add元素的
        List<String> list = new ArrayList<>();
        list.add("");
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
