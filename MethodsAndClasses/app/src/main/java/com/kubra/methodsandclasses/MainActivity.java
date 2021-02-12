package com.kubra.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();

        username="";

        System.out.println("on Resume called");

        testMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("Kubra"));
        makeMusicians();
    }

    public void makeMusicians(){

        //instance

        Musicians james= new Musicians("james","guitar",50);
        System.out.println(james.instrument);

    }

    public void testMethod(){

        username="james";
        int x =4+4;
        x=9;
        System.out.println("value of x:"+x);
    }
    public String newMethod(String string ){

username="Merve";
        return string+ " new Method";
    }

    public int math(int a ,int b){
        username="Jeffrey";
        int x=11;
        System.out.println("value of x in math:"+x);

        return a+b;
    }
    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("on Start called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on Stop called");
    }
}
