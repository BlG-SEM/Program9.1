package ru.vsu.cs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public static List createNewList(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                result.add(list1.get(i));
            }
        }

        return result;
    }
}
