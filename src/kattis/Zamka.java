package kattis;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int tar = sc.nextInt();
        for (int i = min; i <= max; i++) {
            String temps = Integer.toString(i);
            int temp =0;
            for (int j = 0; j < temps.length(); j++) {
                temp += Character.getNumericValue(temps.charAt(j));
            }
            if(temp==tar){
                System.out.println(i);
                break;
            }
        }
        for (int i = max; i >= min; i--) {
            String temps = Integer.toString(i);
            int temp =0;
            for (int j = 0; j < temps.length(); j++) {
                temp += Character.getNumericValue(temps.charAt(j));
            }
            if(temp==tar){
                System.out.println(i);
                break;
            }
        }
    }
}
