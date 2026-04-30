package com.gla.workshop;
interface Length{
    int  lengthofstring(String s);
}
public class StreamapiwithString {
    public static void main(String[]args)
    {
        Length length=(String s)->(s.length());
        System.out.println(length.lengthofstring("akshat"));
    }
}
