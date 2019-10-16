package kattis;

import java.util.Scanner;

public class HelpaPhDcanidateout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            String temp = sc.nextLine();
            if(temp.equals("P=NP")){
                System.out.println("skipped");
            }
            else{
               // String[] y = temp.split("");
                //int add = Integer.parseInt(y[0])+Integer.parseInt(y[1]);
                System.out.println(temp);
            }
        }
    }
}
