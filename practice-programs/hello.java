package com.gla.workshop;
import java.util.Stack;
public class hello {
   public static void main(String[] args) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        String str="madam";
        for(int i=0;i<str.length();i++)
        {
            s1.push(str.charAt(i));
        }
        String rev="";
        while(!s1.isEmpty())
        {
            rev+=s1.pop();
        }
       System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
