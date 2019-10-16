package kattis;

import java.util.Scanner;

public class PizzaCrust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r =sc.nextInt(),
                c=sc.nextInt();
        if(c-r==0){
            System.out.println(c-r);
            return;
        }
        c=Math.pow(r-c,2);
        r=Math.pow(r,2);
        System.out.println((c/r)*100);
    }

}
