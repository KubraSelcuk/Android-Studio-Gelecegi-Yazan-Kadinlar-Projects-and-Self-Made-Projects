package com.kubra.javabasics1;

public class Degiskenler {

    public static void main (String args[]){

        int age=20;
        System.out.println(10*age);
        System.out.println(age/5);

        int x=5;
        int y = 11;

        System.out.println(y/x);

        double z= 5.0;
        double b=11.00;

        System.out.println(b/z);

        long myLong=5;
        System.out.println(myLong/5);

        float myFloat=5.0f;

        double pi=3.14;
         int r=5;
        System.out.println(2*r*pi);

        String name="Kubra";
        String surname="Selcuk";
        String fullname= name+" "+surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        boolean isAlive=true;
        isAlive=false;
        System.out.println(isAlive);
//sabit değişken
        final int myInteger=5;
        System.out.println("myInteger="+myInteger);

        System.out.println("myInteger="+myInteger);
    }
}
