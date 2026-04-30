package com.gla.workshop;

public class WrapperAutoExample {
    public static void main(String[]args)
    {
        //Autoboxing
        int a=10;
        Integer i=a;//Manual approach
        System.out.println("Manual Autoboxing :"+i);
        Integer j= Integer.valueOf(a);//compiler will run internally
        System.out.println(j);
        System.out.println("-------------------------");
        //Unboxing
        Integer b=120;
        int m=b;//manual approach
        int n=b.intValue();
        System.out.println("Manual Unboxing :"+m);
        System.out.println(n);
        //float
        float F=1;
        Float f=F;
        System.out.println("Float :"+f);
        char C='a';
        Character c=C;
        System.out.println("Character :"+c);
        double d=22.000;
        Double D=d;
        System.out.println("Double :"+D);
        boolean bo=true;
        Boolean BO=bo;
        System.out.println("Boolean :"+BO);
        System.out.println(BO);
        byte by=20;
        Byte BY=by;
        System.out.println(BY);
        short s=1;
        Short S=s;
        System.out.println(S);
        long l=4500000;
        Long L=l;
        System.out.println(L);
    }
}
