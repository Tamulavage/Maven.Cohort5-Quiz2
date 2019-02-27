package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer newSize = array1.length + array2.length;

        ArrayList<Integer> tempArrayList = new ArrayList<>();


        for (int i = 0; i < array1.length; i++) {
            tempArrayList.add(array1[i]);
        }
        for (int k = 0; k < array2.length; k++) {
            tempArrayList.add(array2[k]);
        }

        Integer[] retVal = new Integer[newSize];
        tempArrayList.toArray(retVal);

        return retVal;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] retVal = new Integer[array.length];

        for (int i = 0, k = index; i < array.length; i++, k++) {
            if (k == array.length) {
                k = 0;
            }
            retVal[i] = array[k];

        }

        return retVal;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer retVal = 0;

        for (Integer i : array1) {
            if (i == valueToEvaluate) {
                retVal++;
            }
        }
        for (Integer k : array2) {
            if (k == valueToEvaluate) {
                retVal++;
            }
        }

        return retVal;
    }

    public Integer mostCommon(Integer[] array) {
        Integer retVal = 0;
        Integer highCount = 0;
        for (Integer i : array) {
            Integer count = countOccurrence(array, array, i);
            if (count > highCount) {
                highCount = count;
                retVal = i;
            }
        }

        return retVal;
    }
}
