package kattis;

import java.util.Scanner;

public class AnthonyandDiablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble(), y = sc.nextDouble();
        double max =  Math.PI*(Math.pow(((y)/(2*Math.PI)),2));
        if(max>=x){
            System.out.println("Diablo is Happy");
        }
        else{
            System.out.println("Need more materials!");
        }
    }
}
