package kattis;

import java.util.Scanner;

public class PaulEigon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serve = sc.nextInt();
        int numServes = sc.nextInt()+sc.nextInt();
        if((numServes/serve)%2 ==0) System.out.println("paul");
        else System.out.println("opponent");
    }
}
