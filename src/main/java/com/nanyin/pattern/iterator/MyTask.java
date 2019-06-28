package com.nanyin.pattern.iterator;

import java.util.NoSuchElementException;

public class MyTask implements Task {

    private int size = 0 ;

    private Object[] taskTag = new Object[16];

    @Override
    public void add(int mark) {
        taskTag[size] = mark;
        size ++;
    }

    @Override
    public void removeLast() {
        taskTag[--size] = null;
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyTaskItr();
    }

    private class MyTaskItr implements Iterator<Object>{

        private int curr;

        @Override
        public boolean hasNext() {
            return size != curr;
        }

        @Override
        public Object next() {
            int i = curr;
            if(i >= size){
                throw new NoSuchElementException("no element");
            }
            return taskTag[curr++];
        }
    }
}
