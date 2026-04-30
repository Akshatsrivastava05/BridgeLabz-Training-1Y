package com.gla.workshop;
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamAPIPractice2 {
   public static void main(String[]args) {
       //First way to create stream using Stream.of()
        Stream<Integer> stream =Stream.of(1,2,3,4,5,6);
        stream.forEach(n-> System.out.println(n));
       Stream<String> stream1=Stream.of("aa","bb","cc");
        stream1.forEach(System.out::println);
        //Second way to create stream using stream()
       ArrayList<Integer> al=new ArrayList<>();
       al.add(11);
       al.add(23);
       al.add(4);
       al.add(78);
       al.add(56);
       al.add(2);
       System.out.println("----------Using stream()---------");
       Stream<Integer> stm=al.stream();
       stm.forEach(n->System.out.println(n));
       ArrayList<String> st=new ArrayList<>();
       st.add("Akshat");
       st.add("Shikhar");
       st.add("Aditya");
       st.add("Divyansh");
       st.add("Gaurav");
       st.add("Harjeet");
       Stream<String> stream2=st.stream();
       Stream<String> FilterStream=stream2.filter(n->n.startsWith("A"));
       FilterStream.forEach(System.out::println);
       st.stream().filter( m->m.startsWith("A")).forEach(System.out::println);
    }
}
