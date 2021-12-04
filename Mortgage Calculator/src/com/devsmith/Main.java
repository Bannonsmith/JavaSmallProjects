package com.devsmith;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        System.out.println("Welcome to the Bank of BHI!!!!");
        System.out.println("Please enter the following information:");
        System.out.println();

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float aiRate = scanner.nextFloat();
        aiRate = (aiRate / PERCENT / MONTHS_IN_YEAR);


        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        double top = aiRate * (1 + aiRate);
        int calculatedPeriod = period * MONTHS_IN_YEAR;
        double mortgage = principal
                    * (aiRate * Math.pow(1 + aiRate, calculatedPeriod))
                    / (Math.pow(1 + aiRate, calculatedPeriod) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
