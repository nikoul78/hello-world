package com.company;


import java.util.Scanner;

public class CetAverage {
    public static void main (String [] agrs){
        Scanner input = new Scanner(System.in);
        double number = Double.parseDouble(input.nextLine());
        Scanner inputSec = new Scanner(System.in);
        double numberSec = Double.parseDouble(input.nextLine());
        Scanner inputThird = new Scanner(System.in);
        double numberThird = Double.parseDouble(input.nextLine());

        double average = (number+numberSec+numberThird)/3;

        System.out.format("%.2f",average);
    }

}
