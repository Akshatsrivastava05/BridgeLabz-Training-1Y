package com.gla.workshop;
import java.util.*;
public class fibonacci {
    public static<T > void f(T a)
    {
        int t=Integer.parseInt(a.toString());
         int b=0;
         int c=1;
        int sum=0;
        for(int i=0;i<t;i++)
        {
            System.out.println(b);
            sum=b+c;
            b=c;
            c=sum;
        }
    }
    public static void main(String[]args)
    {
        f(2);
    }
}
