package kattis;

import java.util.Scanner;

public class NotAmused {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] x = new int[i];
        int unique =0;
        int[] temp = new int[100];
        int count =0;
        for (int j = 0; j < x.length; j++) {
            count =sc.nextInt();
            x[j] = count;
            temp[count]++;
        }
        for (int l = 100; 0<l; l--){
            if (temp[l-1]==1) {
                unique = l-1;
                break;
            }
        }
        for (int j = 0; j < i; j++) {
            if (x[j]==unique) {
                unique =j;
                System.out.println(unique+1);
                return;
            }
        }
        System.out.println("none");
    }
}
