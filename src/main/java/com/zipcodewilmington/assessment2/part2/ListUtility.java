package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List<Integer> list = new ArrayList<>();

    public ListUtility() {
        // list
    }

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(list.get(0));
        int currentInt = list.get(0);

        for (int i = 1; i < size(); i++) {
            if (list.get(i - 1) != list.get(i)) {
                uniqueList.add(list.get(i));
            }
        }

        return uniqueList;
    }

    public String join() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {

            sb.append(list.get(i));
            if (i != (size() - 1)) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public Integer mostCommon() {
        Integer retVal = 0;
        Integer highCount = 0;
        for (Integer i : list) {
            Integer count = countOccurrenceInList(i);
            if (count > highCount) {
                highCount = count;
                retVal = i;
            }
        }

        return retVal;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }

    public Integer countOccurrenceInList(Integer integer) {
        Integer retVal = 0;

        for (Integer k : list) {
            if (k == integer) {
                retVal++;
            }
        }

        return retVal;
    }
}



