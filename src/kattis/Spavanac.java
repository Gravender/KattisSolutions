package kattis;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        minute -= 45;
        if(minute <0){
            if(hour==0){
                hour=23;
                minute+=60;
                System.out.println(hour + " " + minute);
            }
            else{
                hour--;
                minute+=60;
                System.out.println(hour + " " + minute);
            }
        }
        else{
            System.out.println(hour + " " + minute);
        }
    }
}
