package kattis;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().contains("ss")) System.out.println("hiss");
        else System.out.println("no hiss");
    }
}
