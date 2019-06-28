package com.nanyin.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator iterator = (Iterator) list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
