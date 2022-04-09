package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        System.out.println(h * 3600 + m * 60 + s);


    }
}
