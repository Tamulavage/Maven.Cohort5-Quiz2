package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Boolean retval = false;
        Integer len = array.length;
        if(len%2 == 0){
            retval = true;
        }

        return retval;
    }

    public Integer[] range(int start, int stop) {

        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

        for(int i = start;  i<= stop; i++, start++)
        {
            tempArrayList.add(i);
        }

        Integer[] retVal = new Integer[tempArrayList.size()];
        tempArrayList.toArray(retVal);


        return retVal;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0]*array[1];
    }
}
