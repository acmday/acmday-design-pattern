package com.acmday.design.pattern.server.iterator;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
