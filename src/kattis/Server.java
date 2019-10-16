package kattis;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < x; i++) {
            int temp = sc.nextInt();
            if(sum+temp>max){
                System.out.println(i);
                return;
            }
            else if(sum+temp==max){
                System.out.println(i+1);
                return;
            }
            sum = sum+temp;

        }
    }
}
