package com.gla.workshop;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionFrameworkPractice {
  public  static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        Vector<Boolean> vector=new Vector<>();
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
      System.out.println(st);
      st.pop();
      System.out.println(st);
      System.out.println(st.peek());
      System.out.println(st.size());
      System.out.println(st.isEmpty());
      //LinkedList
      ll.add(11);
      ll.add(22);
      ll.add(33);
      ll.add(44);
      System.out.println("-----------LinkedList------------");
      ll.set(0,90);
      System.out.println(ll);
      LinkedList<Integer> l=new LinkedList<>();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      ll.addAll(l);
      System.out.println(ll);

    }
}
