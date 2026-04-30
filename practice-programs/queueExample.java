package com.gla.workshop;
import java.util.*;
public class queueExample {
    public static void main(String[]args)
    {
        Queue<Integer> q=new LinkedList<>();
        // Queue<Integer> q=new ArrayDeque<>();
        q.add(34);
        q.add(92);
        q.add(60);
        q.offer(12);
        q.offer(20);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());  //same as peek()
        q.remove();
        System.out.println(q);
        q.poll();   //same as remove()
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.contains(20));
        System.out.println("-------------------------");
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("A");
        pq.offer("B");
        pq.offer("C");
        pq.offer("D");
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println("---------------");
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addLast(56);
        dq.addFirst(70);
        dq.offerLast(99);
        dq.offerFirst(88);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
    }
}
