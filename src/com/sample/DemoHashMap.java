package com.sample;

import java.util.HashMap;
import java.util.WeakHashMap;

public class DemoHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        String one=new String("one");
        String two=new String("two");
        String three=new String("three");

        Integer oneValue=1;
        Integer twoValue=2;
        Integer threeValue=3;

       hashMap.put(one,oneValue);
       hashMap.put(two,twoValue);
       hashMap.put(three,threeValue);

        two=null;
        System.gc();

        System.out.println(hashMap);


    }
}
