package com.gla.workshop;
import java .util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapPractice {
   public static void main(String[]args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(2,90);
        hm.put(6,88);
        hm.put(3,78);
        hm.put(1,99);
       System.out.println(hm.keySet());
       for(int a:hm.keySet())
       {
           System.out.println(a);
       }
       System.out.println("Values :"+hm.values());
       for(int b:hm.values())
       {
           System.out.println(b);
       }
       System.out.println(hm);

        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
        TreeMap<Integer,String> tm=new TreeMap<>();
    }
}
