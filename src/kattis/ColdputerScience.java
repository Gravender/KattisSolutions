package kattis;

import java.util.Scanner;

public class ColdputerScience {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int temp =0;
            for (int i = 0; i < x; i++) {
                if(sc.nextInt()<0){
                    temp++;
                }
            }
            System.out.println(temp);
        }
}
