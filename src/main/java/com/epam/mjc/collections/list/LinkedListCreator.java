package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            Integer num = sourceList.get(i);
            if (num % 2 != 0) {
                list.addFirst(num);
            } else {
                list.addLast(num);
            }
        }
        return list;
    }
}
