package com.kubra.javabasics1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args)
    {

//Diziler
        String[]myStringArray=new String[3];
        myStringArray[0]="Kubra";
        myStringArray[1]="Ali";
        myStringArray[2]="Anna";

        System.out.println(myStringArray[1]);

        int[]myIntegerArray= new int[3];
        myIntegerArray[0]=50;
        myIntegerArray[1]=60;
        myIntegerArray[2]=70;

        System.out.println(myIntegerArray[1]);

        int[]myNumberArray={1,2,3,4,5,6};
        System.out.println(myNumberArray[2]);
 //Listeler
        ArrayList<String>myMusicians=new ArrayList<String>();

        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        //Set

        HashSet<String>mySet=new HashSet<String>();

        mySet.add("James");
        mySet.add("James");

        System.out.println(mySet.size());

        HashMap<String,String>myHashMap=new HashMap<String,String>();

        myHashMap.put("name","James");
        myHashMap.put("instrument","Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String,Integer>mySecondMap=new HashMap<>();

        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);

        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));










    }
}
