package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {

    SortedMap<String, String> sm = new TreeMap();
    Set set = sm.entrySet();


    public void add(String path, String controller) {
        sm.put(path, controller);
    }

    public Integer size() {
        return sm.size();
    }

    public String getController(String path) {
        return sm.get(path);
    }

    public void update(String path, String studentController) {
        sm.put(path, studentController);
    }

    public void remove(String path) {
        sm.remove(path);
    }

    public String toString(){
        Iterator i = set.iterator();
        String retval = "";


        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            retval = retval + me.getKey() + " -> " + me.getValue() + "\n";
        }
    return retval;
    }
}
