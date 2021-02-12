package com.kubra.javabasics1;

public class Loops {
    public static void main(String[] args) {
        int[] myNumbers = {12, 15, 18, 21, 24};


        //int x =myNumbers[0]/3*5;


        for (int i = 0; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            //System.out.println(x);
        }

//for döngüsü 2

        for (int number : myNumbers) {

            //System.out.println(number / 3 * 5);


        }
        for(int a=0;a<10;a++){

            int b=a*10;
            System.out.println(b);
        }

        //while

        int j=0;

        while(j<10){

            int b=j*10;
            System.out.println(b);
            j++;
        }

    }
}
