package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        byte c = scan.nextByte();

        System.out.println(a * 3600 + b * 60  + c);


    }
}
