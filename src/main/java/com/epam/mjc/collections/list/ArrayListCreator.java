package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> repeatList = new ArrayList<>();
        for (int i = 1; i <= sourceList.size(); i++) {
            if (i % 3 == 0) {
                repeatList.add(sourceList.get(i - 1));
                repeatList.add(sourceList.get(i - 1));
            }
        }
        return repeatList;
    }
}
