package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        measureTime(seconds);
        scanner.close();
    }

   public static void measureTime (int a) {
       a = a % 86400;
       int b = a / 3600;
       float d = (a % 3600);
       int c = (int) (d / 60);
       float f = d % 60;
       int g = (int) f;

       System.out.printf("%02d:%02d:%02d\n", b, c, g);
    }
}
