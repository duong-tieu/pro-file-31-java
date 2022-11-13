package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        double money ;
        int month ;
        double interestRate ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        money = input.nextDouble();

        System.out.println("Enter the of month :");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}