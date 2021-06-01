package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = money.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = money.nextDouble();
        System.out.print("Enter the number of years: ");
        int year = money.nextInt();

        double total = principal * (1 + ((rate / 100) * year));
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("After " + year + " years at " + rate + "%, the investment will be worth $" + df.format(total) + ".");

    }
}
