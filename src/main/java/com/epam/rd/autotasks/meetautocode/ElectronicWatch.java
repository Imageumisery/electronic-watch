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
        int b = a / 3600;
        float d = (a % 3600);
       int c = (int) (d / 60);
        float f = d % 60;
        int g = (int) f;

        while (a > 0 && a !=0) {
            while (d !=0) {
                System.out.println(b + ":"+ c + ":" + g);
                break;
            }
            while (a == 86400){
                System.out.println("00:00:00");
                break;
            }
            while (a > 86400) {
                System.out.println();
                break;
            }
            break;
        }
    }
}
