package com.example.demo;

import java.util.Scanner;

public class tyr {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast nummer mellem 1 og 3): ");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("1");
            } else if (number == 2) {
                System.out.println("2");
            } else if (number == 4) {
                System.out.println("4");
            } else {
                System.out.println("Ingen af delene");
            }

            scanner.close();
        }
    }
