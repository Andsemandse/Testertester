package com.example.demo;

import java.util.Scanner;

public class tyr {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast nummer mellem 1 og 3): ");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("1");
            } else if (number == 3) {
                System.out.println("3");
            } else if (number == 5) {
                System.out.println("5");
            } else if (number == 7) {
                System.out.println("7");
            } else {
                System.out.println("Ingen af delene");
            }

            scanner.close();
        }
    }
