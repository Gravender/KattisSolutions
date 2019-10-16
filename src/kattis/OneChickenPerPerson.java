package kattis;

import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            if(Math.abs(x-y)==1){
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            }
            else{
                System.out.println("Dr. Chaz needs "+Math.abs(x-y)+" more pieces of chicken!");
            }
        }
        else{
            if(Math.abs(x-y)==1){
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            }
            else{
                System.out.println("Dr. Chaz will have "+Math.abs(x-y)+" pieces of chicken left over!");
            }
        }

    }
}
