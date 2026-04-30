package com.gla.workshop;
import java.util.*;
public class StreamApiPractice {
    /*(String s)->{
    s.length();
    }; */
    interface SumOfTwoNumber {
        int sumOfTwoNumber(int a, int b);
    }
    public static void main(String[]args)
    {
        SumOfTwoNumber sum=(int a,int b)->(a+b);
        System.out.println(sum.sumOfTwoNumber(11,22));
        //we can create stream in two ways
        //1. Streamof(o1,o2,o3.....)
        //2.Stream() method
        /*Stream api provides several methods to perform operation on data
        stream api method is divided into two types
        1.Intermediate operational methods(iom)
        Iom will perform operations on data &return new stream eg map(),filter()
        2.terminal operational methods(TOM)
        Tom will take input and provide results eg- count()
        */
    }
}
