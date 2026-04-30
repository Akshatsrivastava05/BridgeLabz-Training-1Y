package com.gla.workshop;
import java.util.*;
public class BoundedGenericsExample {
    public static<T extends Number> void f(Double  a)
    {
        int b=0;
        int c=1;
        int sum=0;
        for(int i=0;i<a;i++)
        {
            System.out.println(b);
            sum=b+c;
            b=c;
            c=sum;
        }
    }
    public static void main(String[]args)
    {
        f(5.3);
    }
}
