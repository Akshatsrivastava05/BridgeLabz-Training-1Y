package com.gla.workshop;
import java.util.*;
public class setExample {
    public static void main(String[]args)
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(88);
        hs.add(0);
        hs.add(63);
        hs.add(1);
        hs.add(56);
        System.out.println("===========HashSet==========");
        System.out.println(hs);
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(88);
        lhs.add(0);
        lhs.add(63);
        lhs.add(1);
        lhs.add(56);
        System.out.println("===========LinkedHashSet========");
        System.out.println(lhs);
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(23);
        ts.add(456);
        ts.add(987);
        ts.add(99);
        ts.add(6);
        System.out.println("==========TreeSet===========");
        System.out.println(ts);
    }
}
