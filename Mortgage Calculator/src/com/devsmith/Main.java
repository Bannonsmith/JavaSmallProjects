package com.devsmith;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        float aiRate;
        byte period;
        int calculatedPeriod;


        System.out.println("Welcome to the Bank of BHI!!!!");
        System.out.println("Please enter the following information:");
        System.out.println();


        while(true){
            System.out.print("Principal ($1K - $1M: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1000000)
                break;
            else
                System.out.println("Enter a number between $1,000 and 1,000,000");
        }


        while(true) {
            System.out.print("Annual Interest Rate: ");
            aiRate = scanner.nextFloat();
            if(aiRate >= 1 && aiRate <= 30 ) {
                aiRate = (aiRate / PERCENT / MONTHS_IN_YEAR);
                break;
            } else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        while(true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if(period >= 1 && period <= 30 ) {
                calculatedPeriod = period * MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        double mortgage = principal
                    * (aiRate * Math.pow(1 + aiRate, calculatedPeriod))
                    / (Math.pow(1 + aiRate, calculatedPeriod) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
