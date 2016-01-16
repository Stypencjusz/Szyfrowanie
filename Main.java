package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj ciag znaków = ");
        String tekst = odczyt.nextLine();
        odczyt.close();
        for (int i = 0; i < tekst.length(); i++) {
            int a = Integer.valueOf(tekst.charAt(i));
            if (a==122 || a==90)
            {
                if (a==122)
                    System.out.print("a");
                if (a==90)
                    System.out.print("A");
            }
            else
            {
                a+=2;
                char ch = (char) a;
                System.out.print(ch);
            }
        }
        System.out.println("");
    }
}