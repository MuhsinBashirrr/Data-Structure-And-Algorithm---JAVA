package com.muhsin;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in  C :");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
