package kattis;

import java.util.Scanner;

public class PrintSatue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(1 + (int)Math.ceil(Math.log(sc.nextInt()) / Math.log(2)));
    }
}
