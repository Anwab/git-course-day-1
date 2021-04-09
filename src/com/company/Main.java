package com.company;

public class Main {

    public static void main(String[] args) {

        String Name= "Anna";
        int age = 15;

        printName (Name);
        oneYearPasses (age);


         }

    private static void printName(String Name) {
        System.out.println( "Your name is " + Name + ".");

    }

    public static int oneYearPasses (int age){
            System.out.println( "Anna turned " + (age+1)+ " years old.");
            return age+1;

	// write your code here
        }
        }
