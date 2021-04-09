package com.company;

public class Main {

    public static void main(String[] args) {

        String Name= "Anna";
        int age = 15;



        if (age>50){
        tenYearPasses (age);

         }

        else{ oneYearPasses (age);
    }
    }

    private static int tenYearPasses(int age) {
        System.out.println( "Anna turned " + (age+10)+ " years old.");
        return age+10;

    }

    public static int oneYearPasses (int age){
            System.out.println( "Anna turned " + (age+1)+ " years old.");
            return age+1;

	// write your code here
        }

    }