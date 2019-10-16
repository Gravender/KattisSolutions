package kattis;

import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        if(Math.abs(x-y)>Math.abs(y-z)){
            System.out.println(Math.abs(x-y)-1);
        }
        else if(Math.abs(x-y)<Math.abs(y-z)){
            System.out.println(Math.abs(y-z)-1);
        }
        else{
            System.out.println(Math.abs(x-y)-1);
        }
    }
}
