package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int compare = Integer.compare(getFunctionResult(a), getFunctionResult(b));
        if (compare == 0) {
            return a.compareTo(b);
        }
        return compare;
    }

    private int getFunctionResult(String stringNumber) {
        int num = Integer.parseInt(stringNumber);
        return 5 * num * num + 3;
    }
}
