package kattis;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() >0){
            if(sc.nextInt()>0){
                System.out.println(1);
            }
            else{
                System.out.println(4);
            }
        }
        else{
            if(sc.nextInt()>0){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }

    }
}
