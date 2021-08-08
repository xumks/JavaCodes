package com.welays; //包名

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here 编写代码

        System.out.println("Hello,World!");

        int age = 30;
        System.out.println(age);

        byte b = 30;
        int i = b;
        float f = 12.33f;
        long ll = 123123_23_32L;
        double l = 12.23;
        boolean isTrue = true;

        Date date= new Date();
        date.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}

//cd com/welays/
//javac Main.java
//cd ../..
//java Main
// print  Hello, World!
