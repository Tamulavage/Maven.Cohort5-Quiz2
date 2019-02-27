package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value>=5;
    }

    public Boolean isLessThan7(Integer value) {
        return value<=7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return (7>=valueToEvaluate && valueToEvaluate>=5);
    }

    public Boolean startsWith(String string, Character character) {
        String tmp = character.toString();
        tmp = tmp.toLowerCase();
        Character newLowerChar = tmp.charAt(0);

       return string.toLowerCase().charAt(0)== newLowerChar;
    }
}
