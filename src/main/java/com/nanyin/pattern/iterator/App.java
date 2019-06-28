package com.nanyin.pattern.iterator;

public class App {
    public static void main(String[] args) {
        Task task = new MyTask();
        task.add(1);
        task.add(3);
        task.add(4);
        task.add(2);
        task.removeLast();
        task.removeLast();
        task.add(5);
        Iterator taskIterator = task.iterator();
        while(taskIterator.hasNext()){
            System.out.println(taskIterator.next());
        }
    }
}
