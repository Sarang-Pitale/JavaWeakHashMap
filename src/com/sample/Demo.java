package com.sample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class Demo {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>(); // Creation

        String one=new String("one");  //Object Creation
        String two=new String("two");
        String three=new String("three");

        Integer oneValue=1;
        Integer twoValue=2;
        Integer threeValue=3;

        weakHashMap.put(one,oneValue); // adding element to Weak Hash Map
        weakHashMap.put(two,twoValue);
        weakHashMap.put(three,threeValue);
        two=null; // making a reference eligible to garbage collection
        System.gc(); // call to garbage collector

        System.out.println(weakHashMap); // print the hash map contents

    }
}
