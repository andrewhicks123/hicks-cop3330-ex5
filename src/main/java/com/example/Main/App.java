/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Andrew Hicks
 */


package com.example.Main;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        System.out.println( "What is the first number? " );
        int num = input.nextInt();
        System.out.println("What is the second number? ");
        int two = input.nextInt();
        System.out.println(num + " + " + two + " = " + (num+two));
        System.out.println(num + " - " + two + " = " + (num-two));
        System.out.println(num + " * " + two + " = " + (num*two));
        System.out.println(num + " / " + two + " = " + (num/two));


    }
}
